package operation;

import booksystem.booklist;

public class showBooklist implements IOperation{
    @Override
    public void work(booklist booklist1) {
        booklist1.showbooklist();
    }
}
