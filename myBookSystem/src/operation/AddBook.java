package operation;

import booksystem.Book;
import booksystem.booklist;

public class AddBook  implements IOperation{
    @Override
    public void work(booklist booklist1) {
        booklist1.books[booklist1.booknumber++]= new Book();

    }
}
