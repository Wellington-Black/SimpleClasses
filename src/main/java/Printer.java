public class Printer {
    private int sheetsLeft;

    public Printer() {
        this.sheetsLeft = sheetsLeft;
    }

    public void print(int pages, int copies) {
        if (copies <= sheetsLeft) {
            sheetsLeft -= (copies * pages);
        }
    }

}
