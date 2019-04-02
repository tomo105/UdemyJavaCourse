package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPrintedPages;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel < 0)
            this.tonerLevel = 0;
        else if (tonerLevel > 100)
            this.tonerLevel = 100;
        else
            this.tonerLevel = tonerLevel;
        this.numberOfPrintedPages = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner() {
        if (this.tonerLevel != 100)
            this.tonerLevel = 100;
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("duplex mode on");
            this.numberOfPrintedPages += pagesToPrint;
        }
        return pagesToPrint;

    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
