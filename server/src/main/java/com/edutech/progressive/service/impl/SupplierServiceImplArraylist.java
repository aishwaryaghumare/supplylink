package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplArraylist  implements SupplierService{

    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        SupplierService.super.emptyArrayList();
    }

}