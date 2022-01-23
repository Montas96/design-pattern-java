package com.umbrella.designpattern.structural.adapter.userExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/adapter")
public class UserAdapterResource {


    private static List<UserDTO> getUsers(UserAdapter userAdapter, String role) {
        switch (role) {
            case "EMPLOYEE":
                return userAdapter.getEmployeeUsers();
            case "SELLER":
                return userAdapter.getSellerUsers();
            case "CUSTOMER":
                return userAdapter.getCustomerUsers();
            default:
                return userAdapter.getAllUsers();
        }
    }

    @GetMapping("/users")
    public void getUsers() {
        UserAdapter userAdapter = new UserAdapterImpl();
        System.out.println("All users");
        getUsers(userAdapter, "all").forEach(userDTO -> System.out.println(userDTO.getId()));

        System.out.println("Employees");
        getUsers(userAdapter, "EMPLOYEE").forEach(userDTO -> System.out.println(userDTO.getId()));

        System.out.println("Customers");
        getUsers(userAdapter, "CUSTOMER").forEach(userDTO -> System.out.println(userDTO.getId()));

        System.out.println("Sellers");
        getUsers(userAdapter, "SELLER").forEach(userDTO -> System.out.println(userDTO.getId()));

    }
}
