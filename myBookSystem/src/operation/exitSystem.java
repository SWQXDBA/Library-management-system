package operation;

import booksystem.booklist;

public class exitSystem implements IOperation{
    @Override
    public void work(booklist booklist1) {
 System.exit(1);
    }
}
