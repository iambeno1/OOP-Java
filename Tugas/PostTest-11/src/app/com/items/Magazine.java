package app.com.items;

public class Magazine extends LibraryItem implements Loanable {
    public Magazine(String title, String author, int publicationYear){
        super(title, author, publicationYear);
    }

    @Override
    public void loan() {
        System.out.println("The magazine \"" + title + "\" has been loaned.");
    }

    @Override
    public void returnItem() {
        System.out.println("The magazine \"" + title + "\" has been returned");
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine [Title: " + title + ", Author: " + author + ", Year: " + publicationYear + "]");
    }
    
}
