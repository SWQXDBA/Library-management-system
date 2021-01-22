package user;

import booksystem.booklist;
import operation.IOperation;

public abstract class User {
     String name;
     IOperation ioperations[];
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public abstract void dooption(booklist booklist1 ,int choice);
}
