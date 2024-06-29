package app.com.items;

public class Book extends LibraryItem implements Loanable {
    public Book(String title, String author, int publicationYear){
        super(title, author, publicationYear);
    }
    
    @Override
    public void loan(){
        System.out.println("The book \"" + title + "\" has been loaned");
    }
    
    @Override
    public void returnItem(){
        System.out.println("The book \"" + title + "\" has been returned");        
    }

    @Override
    public void displayInfo() {
        System.out.println("Book [Title : " + title + " Author : " + author + "Year: " + publicationYear + "]" );
        
    }
}
