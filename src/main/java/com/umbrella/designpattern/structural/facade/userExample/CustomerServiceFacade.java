package com.umbrella.designpattern.structural.facade.userExample;

import java.util.ArrayList;
import java.util.List;

enum CustomerType {
    B2B, B2C
}

enum SortingType {
    ALL, BY_COMPANY
}

public class CustomerServiceFacade {

    public List getCustomer(CustomerType customerType, SortingType sortingType) {
        List list;
        switch (customerType) {
            case B2B: {
                CustomerB2BService customerB2BService = new CustomerB2BService();
                switch (sortingType) {
                    case ALL: {
                        list = customerB2BService.getAllB2BCustomers();
                        break;
                    }
                    case BY_COMPANY: {
                        list = new ArrayList();
                        for (Company company : customerB2BService.getAllCompanies()) {
                            list.add(customerB2BService.getCustomerB2BByCompany(company.getId()));
                        }
                        break;
                    }
                    default:
                        return null;
                }
                break;
            }
            case B2C: {
                list = new CustomerB2CService().getAllB2CCustomers();
                break;
            }
            default:
                return null;
        }
        return list;
    }

    public int countCustomers(CustomerType customerType, SortingType sortingType, String companyId) {
        switch (customerType) {
            case B2B: {
                CustomerB2BService customerB2BService = new CustomerB2BService();
                switch (sortingType) {
                    case BY_COMPANY:
                        return customerB2BService.getCustomerB2BByCompany(companyId).size();
                    case ALL:
                        return customerB2BService.getAllB2BCustomers().size();
                }
                break;
            }
            case B2C:
                return new CustomerB2CService().countCustomersB2C();
        }

        return 0;
    }

}
