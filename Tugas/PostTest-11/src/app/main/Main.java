package app.main;

import app.com.items.*;
import app.com.member.*;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("Effective Java", "Joshua Bloch", 2008);
        LibraryItem magazine = new Magazine("National Geographic", "Various", 2021);
        Ebook ebook = new Ebook("Clean Code", "Robert C. Martin", 2008);

        LibraryMember regularMember = new RegularMember("Alice", "RM001");
        LibraryMember premiumMember = new PremiumMember("Bob", "PM001");

        book.displayInfo();
        magazine.displayInfo();
        ebook.displayInfo();

        regularMember.borrowItem(book);
        regularMember.borrowItem(magazine);
        regularMember.borrowItem(ebook);

        premiumMember.borrowItem(book);
        premiumMember.borrowItem(magazine);
        ((PremiumMember) premiumMember).downloadEbook(ebook);
    }
}

