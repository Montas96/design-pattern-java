package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl {

    public List<Customer> getCustomers() {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("CUSTOMER-1", new User("CUSTOMER-1", "CUSTOMER")));
        customerList.add(new Customer("CUSTOMER-2", new User("CUSTOMER-2", "CUSTOMER")));
        customerList.add(new Customer("CUSTOMER-3", new User("CUSTOMER-3", "CUSTOMER")));
        return customerList;
    }


}
