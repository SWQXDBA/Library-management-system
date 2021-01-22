package booksystem;

import java.util.Scanner;

public class Book {
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "书名：" + name +
                ", 价格：" + price +
                "," + (ifborrowed?"已借出":"未借出") +
                '}';
    }

    public Book() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入书名");
        this.name = scan.nextLine();
        System.out.println("请输入价格");
        this.price = scan.nextDouble();
        this.ifborrowed = false;
    }

    public String getName() {
        return name;
    }

    public void setIfborrowed(boolean ifborrowed) {
        this.ifborrowed = ifborrowed;
    }

    private String name;
    private double price;
    private boolean ifborrowed;
}
