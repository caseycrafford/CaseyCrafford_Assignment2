package za.ac.cput.Asssignment2;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void listAddTest(){
        List<Customer> customerList=new ArrayList();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerList.add(customer);
        }

        assertEquals(5,customerList.size());
    }

    @Test
    void setAddTest(){
        Set<Customer> customerSet=new HashSet<>();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerSet.add(customer);
        }

        assertEquals(5,customerSet.size());
    }

    @Test
    void mapAddTest(){
        Map<Integer,Customer> customerMap=new HashMap();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerMap.put(i,customer);
        }

        assertEquals(5,customerMap.size());
    }

    @Test
    void collectionAddTest(){
        Collection <Customer> customerCollection=new HashSet();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerCollection.add(customer);
        }

        assertEquals(5,customerCollection.size());
    }

    @Test
    void listRemoveTest(){
        List<Customer> customerList=new ArrayList();

        for(int i=0; i<6; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerList.add(customer);
        }
        customerList.remove(2);

        assertEquals(5,customerList.size());
    }

    @Test
    void setRemoveTest(){
        Set<Customer> customerSet=new HashSet<>();

        for(int i=0; i<6; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerSet.add(customer);
        }
        customerSet.remove(new Customer(1));

        assertEquals(5,customerSet.size());
    }

    @Test
    void mapRemoveTest(){
        Map<Integer,Customer> customerList=new HashMap();

        for(int i=0; i<6; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerList.put(i,customer);
        }
        customerList.remove(2);

        assertEquals(5,customerList.size());
    }

    @Test
    void collectionRemoveTest(){
        Collection <Customer> customerCollection=new HashSet();

        for(int i=0; i<6; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerCollection.add(customer);
        }
        customerCollection.remove(new Customer(4));
        assertEquals(5,customerCollection.size());

    }

    @Test
    void listFindTest(){
        List<Customer> customerList=new ArrayList();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerList.add(customer);
        }
        assertTrue(customerList.contains(new Customer(2)));
    }

    @Test
    void setFindTest(){
        Set<Customer> customerSet=new HashSet<>();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerSet.add(customer);
        }

        assertTrue(customerSet.contains(new Customer(0)));
    }

    @Test
    void mapFindTest(){
        Map<Integer,Customer> customerMap=new HashMap();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerMap.put(i,customer);
        }

        assertTrue(customerMap.containsKey(4));
    }

    @Test
    void collectionFindTest(){
        Collection <Customer> customerCollection=new HashSet();

        for(int i=0; i<5; i++){
            int id=i;
            Customer customer= new Customer(id);
            customerCollection.add(customer);
        }

        assertTrue(customerCollection.contains(new Customer(3)));
    }
}