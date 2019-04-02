package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 50, "sword");
        System.out.println("reamining healt " + player.getHitPoints());
        //no other way to get to field health
        //only by method getHealth !! so its quite safe
        //you can manipulate in class and its don t make
        //any harm when using

        //----------
        Printer printer = new Printer(50, true);
        int pagesToprint = printer.printPage(35);
        System.out.println("printedd pages " + pagesToprint);


    }
}
