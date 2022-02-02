package com.umbrella.designpattern.structural.facade.userExample;

import com.umbrella.designpattern.structural.composite.shapeExample.Circle;
import com.umbrella.designpattern.structural.composite.shapeExample.Drawing;
import com.umbrella.designpattern.structural.composite.shapeExample.Shape;
import com.umbrella.designpattern.structural.composite.shapeExample.Triangle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/facade")
public class UserFacadeTestResource {

    @GetMapping("/customers")
    public void getUser() {
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacade();
        customerServiceFacade.getCustomer(CustomerType.B2B, SortingType.ALL);
        customerServiceFacade.getCustomer(CustomerType.B2B, SortingType.BY_COMPANY);
        customerServiceFacade.countCustomers(CustomerType.B2C, null, null);


    }
}
