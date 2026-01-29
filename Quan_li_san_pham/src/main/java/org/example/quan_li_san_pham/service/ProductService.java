package org.example.quan_li_san_pham.service;

import org.example.quan_li_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iPhone", 20000, "Smartphone", "Apple"));
        products.add(new Product(2, "Samsung", 18000, "Android phone", "Samsung"));
        products.add(new Product(3, "Xiaomi", 12000, "Cheap phone", "Xiaomi"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        Product old = findById(id);
        if (old != null) {
            old.setName(product.getName());
            old.setPrice(product.getPrice());
            old.setDescription(product.getDescription());
            old.setManufacturer(product.getManufacturer());
        }
    }

    @Override
    public void remove(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
