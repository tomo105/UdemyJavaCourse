package firstSevenTasks;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("INvalid Value");
            return;
        }

        int a = 0;
        int temp = kiloBytes;
        while (temp >= 1024) {
            a++;
            temp -= 1024;
        }
        System.out.println(kiloBytes + " KB = " + a + " MB and " + temp + " KB");
    }
}
