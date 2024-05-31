package app.com.member;

import app.com.items.LibraryItem;

public abstract class LibraryMember {
    protected String name;
    protected String memberId;

    public LibraryMember(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
    }

    public abstract void borrowItem(LibraryItem item);
    
}
