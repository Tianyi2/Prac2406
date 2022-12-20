package Prac06;

public class DebugMusical extends DebugPlay {
    protected String composer;
    String title;

    public DebugMusical(String title, String author, String composer) {
        super(title, author);
        this.title = title;
        this.composer = composer;
    }

    public void display() {
        System.out.println("The performance is " + title +
                " by " + author + "\nThe music for " + title +
                " is by " + composer);
    }

    public static void main(String[] args) {
        DebugMusical musical = new DebugMusical("Title", "Author", "Composer");
        musical.display();
    }
}