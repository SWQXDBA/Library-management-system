package user;

import booksystem.booklist;
import operation.*;

import java.util.Scanner;

public class admin extends User{
    public admin(String name) {
        super(name);
        this.ioperations=new IOperation[]{
                new exitSystem(),
                new AddBook(),
                new DeleteBook(),
                new showBooklist(),
                new searchBook(),
                new modifyBook()

        };
    }

    @Override
    public int menu() {
        System.out.println("您好" +  this.name+",欢迎来到图书管理系统");
        System.out.println("1：新增 2:删除 3：显示所有图书 4：查找 5：修改 0：退出 ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }

    @Override
    public  void dooption(booklist booklist1 , int choice) {
        this.ioperations[choice].work(booklist1);
    }
}
