package operation;

import booksystem.booklist;

import java.util.Objects;
import java.util.Scanner;

public class DeleteBook implements IOperation{
    @Override
    public void work(booklist booklist1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scan.next();
        for (int i=0;i<booklist1.booknumber;i++)
        {
            if(Objects.equals(booklist1.books[i].getName(), name)) {
                for(int j=i;j<booklist1.booknumber;j++)
                {
                    booklist1.books[j]=booklist1.books[j+1];
                }

                booklist1.booknumber--;
                System.out.println("删除成功！");
                return ;

            }

        }
        System.out.println("没找到这本书");
    }
}
