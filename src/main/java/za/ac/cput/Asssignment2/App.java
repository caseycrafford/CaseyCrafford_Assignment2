package za.ac.cput.Asssignment2;

/*
 *  ADP372S: Assignment 2
 *  Create a maven application using TDD to show your understanding of the following Java Collection interfaces:
 *  1. Collection
 *  2. Map
 *  3. Set
 *  4. List
 *
 *  Casey Crafford - 219169640
 *  16  May 2021
 */

import java.util.ArrayList;

public class App
{
    static Customer p1=new Customer(2123410,"Casey Crafford","Male");
    static Customer p2=new Customer(1234354,"Benjamin Franklin","Male");
    static Customer p3=new Customer(5436430,"Al Coholic","Male");
    static Customer p4=new Customer(2356321,"Ivana Tinkle","Female");
    static Customer p5=new Customer(9766523,"Joana Smith","Female");
    static Customer pE=new Customer();

    public static void main( String[] args ) {
        List();
        Set();
    }

    public static void List(){
        ArrayList customerList = new ArrayList();

        customerList.add(p2);
        customerList.add(p3);
        customerList.add(p5);
        customerList.add(p4);
        customerList.add(p5);
        customerList.add(0,p1);
        customerList.add(pE);

        customerList.remove(3);
        customerList.remove(pE);

        System.out.println("USING LIST\n**************");
        System.out.println(customerList);

        System.out.println("Is Ivana in the list? : ");
        if(customerList.contains(p4))
            System.out.println(p4.getName()+" was found");

        for (int i =0;i<customerList.size();i++){
            if (((Customer)customerList.get(i)).getName().equals("Benjamin Franklin"))
                System.out.println("Benjamin was  found");
            else if(i==(customerList.size()-1))
                System.out.println("Benjamin was not found");
        }
    }

    public static void Set(){
        System.out.println("USING LIST\n**************");
    }
}
