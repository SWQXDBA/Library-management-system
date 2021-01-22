package booksystem;
import operation.AddBook;
import operation.BorrowBook;
import operation.IOperation;
import user.NormalUser;
import user.User;
import user.admin;

import java.util.*;

public class MAIN {
    public static User login()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的身份> 1admin 2NormalUser");
        int choise=scan.nextInt();
        System.out.println("请输入你的姓名>");
        String name=scan.next();
        if(choise==1)
            return new admin(name);
        else
            return new NormalUser(name);

    }
    public static void main(String []args)
    {
        booklist booklist1=new booklist();
        booklist1.showbooklist();
        User us = login();
        while(true)
        {
            int choice =us.menu();
            us.dooption(booklist1,choice);
        }

    }
}
