package app.com.member;

import app.com.items.LibraryItem;
import app.com.items.Loanable;
import app.com.items.Ebook;

public class PremiumMember extends LibraryMember {
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Loanable) {
            ((Loanable) item).loan();
            System.out.println("Premium member \"" + name + "\" borrowed: " + item.title);
        } else {
            System.out.println("Premium members cannot borrow this item.");
        }
    }

    public void downloadEbook(Ebook ebook) {
        ebook.download();
        System.out.println("Premium member \"" + name + "\" downloaded: " + ebook.title);
    }
}

