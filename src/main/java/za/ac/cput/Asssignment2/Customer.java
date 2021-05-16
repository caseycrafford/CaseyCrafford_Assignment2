package za.ac.cput.Asssignment2;

/**
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

public class Customer {
    private int id;
    private String name, gender;

    public Customer() {

    }

    public Customer(int id, String name, String gender) {
        this.id=id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer: (ID: "+id+" , Name: "+name+" , Gender: "+gender+")\n";
    }
}
