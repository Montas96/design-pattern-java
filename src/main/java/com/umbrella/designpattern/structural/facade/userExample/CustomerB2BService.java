package com.umbrella.designpattern.structural.facade.userExample;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CustomerB2BService {
    public List<CustomerB2B> getAllB2BCustomers() {
        System.out.println("get all b2b customers");
        return null;
    }

    public List<CustomerB2B> getCustomerB2BByCompany(String companyId) {
        System.out.println("get customer b2b by company");
        return null;
    }

    public List<Company> getAllCompanies() {
        System.out.println("get all companies");
        return Collections.singletonList(new Company("COMPANY-1"));
    }

    public Map<String, Integer> countCustomersByCompany() {
        System.out.println("count customer by company");
        return null;
    }
}
