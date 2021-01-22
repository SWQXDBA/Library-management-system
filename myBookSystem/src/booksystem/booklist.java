package booksystem;

public class booklist {
    public Book [] books=new Book[100];
    public int booknumber;
    public booklist() {
        this.books[0] = new Book("语文",80);
        this.books[1] = new Book("数学",90);
        this.books[2] = new Book("英语",85);
        booknumber=3;
    }

    public void showbooklist()
    {
        for(int i=0;i<booknumber;i++)
            System.out.println(this.books[i]);

    }
}
