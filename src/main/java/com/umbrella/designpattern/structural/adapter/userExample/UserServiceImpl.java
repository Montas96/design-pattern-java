package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {

    public List<User> getUsers() {

        List<User> users = new ArrayList<>();
        users.add(new User("EMPLOYEE-1", "EMPLOYEE"));
        users.add(new User("EMPLOYEE-2", "EMPLOYEE"));
        users.add(new User("EMPLOYEE-3", "EMPLOYEE"));
        users.add(new User("SELLER-1", "SELLER"));
        users.add(new User("SELLER-2", "SELLER"));
        users.add(new User("SELLER-3", "SELLER"));
        users.add(new User("CUSTOMER-1", "CUSTOMER"));
        users.add(new User("CUSTOMER-2", "CUSTOMER"));
        users.add(new User("CUSTOMER-3", "CUSTOMER"));
        return users;
    }


}
