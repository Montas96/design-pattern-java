package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.List;
import java.util.stream.Collectors;

/**
 * In this implementation we suppose that we have other services that provide us with different kind of users in the application.
 * We could have a filter method that return users based on role value
 */
public class UserAdapterImpl  implements UserAdapter{


    UserServiceImpl userService = new UserServiceImpl();
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    SellerServiceImpl sellerService  = new SellerServiceImpl();

    @Override
    public List<UserDTO> getAllUsers() {
        return userService.getUsers().stream().map(user -> mapToUserDTO(user)).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getCustomerUsers() {
        return customerService.getCustomers().stream().map(customer -> mapToUserDTO(customer.getUser())).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getSellerUsers() {
        return sellerService.getSellers().stream().map(seller -> mapToUserDTO(seller.getUser())).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getEmployeeUsers() {
        return employeeService.getEmployee().stream().map(employee -> mapToUserDTO(employee.getUser())).collect(Collectors.toList());
    }

    private  UserDTO mapToUserDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        dto.setLogin(user.getLogin());
        return dto;
    }
}
