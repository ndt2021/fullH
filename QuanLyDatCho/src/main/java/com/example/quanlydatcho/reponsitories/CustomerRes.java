package com.example.quanlydatcho.reponsitories;

import com.example.quanlydatcho.model.Customer;
import java.util.ArrayList;
import java.util.Optional;

public class CustomerRes {
    ArrayList<Customer> data = new ArrayList<>();

    public CustomerRes(ArrayList<Customer> data) {
        this.data = data;
    }


    public void add(Customer cs){
        this.data.add(cs);
    }


}
