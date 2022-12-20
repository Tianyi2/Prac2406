package Prac06;

import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
    protected String city;
    protected String size;

    public DebugPhoneBook(int pages, String city)
    {
        super(pages);
        final int CUTOFF = 30;
        this.city = city;
        if(pages < CUTOFF)
            this.size = "big";
        else
            this.size = "small";
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"The phone book for " + city +
                " has " + pages + " pages.\nThat is a " +
                size + " phone book.");
    }

    public static void main(String[] args) {
        DebugPhoneBook phoneBook = new DebugPhoneBook(11, "City");
        phoneBook.display();
        System.out.println(phoneBook.getPages());
    }
}