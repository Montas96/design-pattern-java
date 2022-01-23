package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.List;

public interface UserAdapter {

    List<UserDTO> getAllUsers();

    List<UserDTO> getCustomerUsers();

    List<UserDTO> getSellerUsers();

    List<UserDTO> getEmployeeUsers();
}
