package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.ArrayList;
import java.util.List;

public class SellerServiceImpl {

    public List<Seller> getSellers() {

        List<Seller> sellers = new ArrayList<>();
        sellers.add(new Seller("SELLER-1", new User("SELLER-1", "SELLER")));
        sellers.add(new Seller("SELLER-2", new User("SELLER-2", "SELLER")));
        sellers.add(new Seller("SELLER-3", new User("SELLER-3", "SELLER")));
        return sellers;
    }


}
