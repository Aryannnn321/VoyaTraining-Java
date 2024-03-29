package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>();
        List<Customer> customerByCity=new ArrayList<>();
        Customer customer1=new Customer("surya","10","mysore");
        Customer customer2=new Customer("rohit","20","banglore");
        Customer customer3=new Customer("virat","30","ckm");
        Customer customer4=new Customer("dhoni","40","dharwad");
        Customer customer5=new Customer("ashwal","50","hebbal");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        for ( Customer customer:customerList
             ) {
            System.out.println(customer);
        }
     for ( Customer customer :customerList){
         if (customer.getCustomerCity().equals("banglore")){
            customerByCity.add(customer);

         }
     }
     for (Customer customer:customerByCity){
         System.out.println(customer);
     }



    }
}
