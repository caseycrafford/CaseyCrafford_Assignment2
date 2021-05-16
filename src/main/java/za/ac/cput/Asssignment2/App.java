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

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


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
        Map();
        Collection();
    }

    public static void List(){
        ArrayList customerVisitList = new ArrayList();

        customerVisitList.add(p2);
        customerVisitList.add(p3);
        customerVisitList.add(p5);
        customerVisitList.add(p4);
        customerVisitList.add(p5);
        customerVisitList.add(0,p1);
        customerVisitList.add(pE);

        customerVisitList.remove(3);
        customerVisitList.remove(pE);

        System.out.println("****************************\nUSING LIST\n****************************");
        System.out.println(customerVisitList);

        System.out.println("------------------------------");
        System.out.println("Is Ivana in the list? : ");
        if(customerVisitList.contains(p4))
            System.out.println(p4.getName()+" was found.");

        System.out.println("------------------------------");
        System.out.println("Is Benjamin in the list?: ");
        for (int i =0;i<customerVisitList.size();i++){
            if (((Customer)customerVisitList.get(i)).getName().equals("Benjamin Franklin")) {
                System.out.println("Benjamin was found.");
                break;
            }
            else if(i==(customerVisitList.size()-1))
                System.out.println("Benjamin was not found.");
        }
        System.out.println("------------------------------");
    }

    public static void Set(){
        Set customerSet=new HashSet();

        customerSet.add(p1);
        customerSet.add(p2);
        customerSet.add(p3);
        customerSet.add(p4);
        customerSet.add(p5);
        customerSet.add(pE);

        customerSet.remove(pE);

        System.out.println("****************************\nUSING SET\n****************************");
        System.out.println(customerSet);

        System.out.println("------------------------------");
        System.out.println("Is Al in the set?: ");
        if(customerSet.contains(p3))
            System.out.println(p3.getName()+" is in the set.");
        System.out.println("------------------------------");
    }

    public static void Map(){
        Map customerMap = new HashMap();
        AtomicInteger notfound= new AtomicInteger();

        customerMap.put(p1.getId(),p1);
        customerMap.put(p2.getId(),p2);
        customerMap.put(p3.getId(),p3);
        customerMap.put(p4.getId(),p4);
        customerMap.put(p5.getId(),p5);
        customerMap.put(pE.getId(),pE);

        customerMap.remove(pE.getId());

        System.out.println("****************************\nUSING MAP\n****************************");
        System.out.println(customerMap);

        System.out.println("------------------------------");

        System.out.println("Is Joana in the hashmap?");
        customerMap.forEach((k,v) ->  {
            if((((Customer)v).getName()).equals("Joana Smith"))
                System.out.println("Joana is in the hashmap.");
            else
                notfound.getAndIncrement();
        });
        if(notfound.get()==customerMap.size())
            System.out.println("Not found.");

        System.out.println("------------------------------");

        System.out.println("Is Casey in the hashmap?:");
        if(customerMap.containsValue(p1))
            System.out.println(p1.getName()+" is in the hashmap.");
        System.out.println("------------------------------");
    }

    public static void Collection(){
        Collection <Customer> customerCollection=new HashSet();
        AtomicInteger notfound= new AtomicInteger();
        customerCollection.add(p1);
        customerCollection.add(p2);
        customerCollection.add(p3);
        customerCollection.add(p4);
        customerCollection.add(p5);
        customerCollection.add(pE);

        customerCollection.remove(pE);

        System.out.println("****************************\nUSING GENERIC  COLLECTION\n****************************");
        System.out.println(customerCollection);

        System.out.println("------------------------------");
        System.out.println("Is Al in the collection?: ");
        if(customerCollection.contains(p3))
            System.out.println(p3.getName()+" is in the collection.");

        System.out.println("------------------------------");

        System.out.println("Is Benjamin in the collection?:");
        customerCollection.forEach((v) ->  {
            if(((v).getName()).equals("Benjamin Franklin"))
                System.out.println("Benjamin Franklin is in the collection.");
            else
                notfound.getAndIncrement();
        });
        if(notfound.get()==customerCollection.size())
            System.out.println("Not found.");
        System.out.println("------------------------------");
    }
}
