package Polymorphism;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + ": "
                    + movie.getName() + "\n" + "Plot: " + movie.plot() +"\n");

        }


    }

//---------------------MAIN______________________________

    public static Movie randomMovie() {
        int randomNumber = (int) (random() * 5) + 1; // 0/4 +1
        System.out.println("Random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarsWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
        //  return null; then delete (default: ..)
    }
}
