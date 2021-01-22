package user;

import booksystem.booklist;
import operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioperations=new IOperation[]{
                new exitSystem(),
                new searchBook(),
                new BorrowBook(),
                new ReturnBook(),
                new showBooklist()

        };
    }
    @Override
    public int menu() {
        System.out.println("您好" +  this.name+",欢迎来到图书管理系统");
        System.out.println("1：查找 2:借书 3：归还 4：显示所有图书 0：退出");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }

    @Override
    public void dooption(booklist booklist1, int choice) {
        this.ioperations[choice].work(booklist1);
    }
}
