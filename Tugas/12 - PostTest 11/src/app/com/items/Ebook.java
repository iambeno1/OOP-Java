package app.com.items;

public class Ebook extends LibraryItem implements Downloadable{
    public Ebook(String title, String author, int publicationYear){
        super(title, author, publicationYear);
    }

    @Override
    public void download() {
        System.out.println("The e-book \"" + title + "\" has been downloaded.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Ebook [Title: " + title + ", Author: " + author + ", Year: " + publicationYear + "]");
    }
    
}
