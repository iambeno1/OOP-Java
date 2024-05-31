package app.com.member;

import app.com.items.LibraryItem;
import app.com.items.Loanable;

public class RegularMember extends LibraryMember {
    public RegularMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Loanable) {
            ((Loanable) item).loan();
            System.out.println("Regular member \"" + name + "\" borrowed: " + item.title);
        } else {
            System.out.println("Regular members cannot borrow this item.");
        }
    }
}

