package Singleton;

public class Singleton {
    private static Singleton singleton;
    private int age;

    private Singleton() {
    }


    public static Singleton getInstanceof() {
        if (singleton == null)
            singleton = new Singleton();

        return singleton;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

