public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {

        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {

        if (copies <= sheetsLeft) {
            sheetsLeft -= (copies * pages);
            toner -= (copies * pages);
        }
    }

}
