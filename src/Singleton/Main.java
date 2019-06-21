package Singleton;

public class Main extends Abstract1{

    private static Singleton singleton;

    public static void main(String[] args) {
        singleton = Singleton.getInstanceof();
        singleton.setAge(34);
        System.out.println(singleton.getAge());

    }

    @Override
    public void sayIt() {
        System.out.println("elko "+singleton.getAge());
    }


}
