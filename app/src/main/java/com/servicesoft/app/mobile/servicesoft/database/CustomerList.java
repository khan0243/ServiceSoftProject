package com.servicesoft.app.mobile.servicesoft.database;

import com.servicesoft.app.mobile.servicesoft.customer.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jessie on 2017-02-27.
 */

public class CustomerList {
    public static List <Customer> customers;
    public CustomerList(){
        customers=new ArrayList();
        addCustomers();
    }

    private void addCustomers(){
        customers.add(new Customer("chao", "qi","chao@agonquinlive.com","613-710-5656","45","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));
        customers.add(new Customer("chunyan", "wang","wang@agonquinlive.com","613-740-5656","46","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));
        customers.add(new Customer("Hassan", "Khan","Hassan@agonquinlive.com","613-710-5489","78","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));
        customers.add(new Customer("hu", "zhao","hu@agonquinlive.com","613-860-5656","56","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));
        customers.add(new Customer("lily", "liu","lily@agonquinlive.com","613-860-54512","20","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));
        customers.add(new Customer("Arsia", "Jack","arsia@agonquinlive.com","613-710-4651","13","GreenBank", "Ottawa","Ontario", "K2W 7O9","Canada"));


    }
}
