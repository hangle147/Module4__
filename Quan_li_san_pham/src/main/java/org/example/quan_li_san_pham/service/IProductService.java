package org.example.quan_li_san_pham.service;

import org.example.quan_li_san_pham.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    List<Product> findByName(String name);
}
