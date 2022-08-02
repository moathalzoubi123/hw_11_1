public class Printer {

    private int paperLief;
    private int toner;


    public Printer(int paperLief , int toner) {

        this.paperLief = paperLief;
        this.toner = toner;
    }


    public int print(int pages , int copies){
        if (this.paperLief >= pages) {
            this.toner -= 1;

            return this.paperLief -= copies * pages;

        } else {
            return this.paperLief;
        }
    }}