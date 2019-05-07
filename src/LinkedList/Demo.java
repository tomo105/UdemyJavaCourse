package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Las Vegas");
        addInOrder(placesToVisit, "Praga");
        addInOrder(placesToVisit, "Lublin");
        addInOrder(placesToVisit, "Warsaw");
        addInOrder(placesToVisit, "Barcelona");
        addInOrder(placesToVisit, "Parma");
        addInOrder(placesToVisit, "Alabama");

        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("##########################");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int compare = stringListIterator.next().compareTo(newCity);
            if (compare == 0) {
                System.out.println(newCity + " is already added ");
                return false;
            } else if (compare > 0)  //musimy sie cofnac
            {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            // else  move to another city nothing to do here
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quite = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("no cities :/");
        } else {
            System.out.println("now visiting  " + listIterator.next());
            printList(cities);
        }
        while (!quite) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("vacation ends");
                    quite = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext())
                        System.out.println("now visiting " + listIterator.next());
                    else {
                        System.out.println("Reach the end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Previous city was " + listIterator.previous());
                    } else {
                        System.out.println("This is the first city ");
                        goingForward = true;  ///not possoble to go backwards
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available option:");
        System.out.println("press 0 to quite ");
        System.out.println("press 1 to next city");
        System.out.println("press 2 to previous city ");
        System.out.println("press 3 to print menu options");
    }
}

