package app.com.items;

public abstract class LibraryItem {
    public String title;
    public String author;
    public int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public abstract void displayInfo();
}
