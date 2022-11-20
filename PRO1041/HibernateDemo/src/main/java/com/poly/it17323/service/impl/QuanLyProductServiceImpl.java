/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.Product;
import com.poly.it17323.response.ProductResponse;
import com.poly.it17323.repository.ProductRepository;
import com.poly.it17323.service.QuanLyProductService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class QuanLyProductServiceImpl implements QuanLyProductService {

    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> lists = productRepository.getAll();
        List<ProductResponse> responses = new ArrayList<>();
        for (Product product : lists) {
            ProductResponse productResponse = new ProductResponse(product);
            responses.add(productResponse);
        }
        return responses;
    }
    public static void main(String[] args) {
        List<ProductResponse> lists = new QuanLyProductServiceImpl().getAllProducts();
        for (ProductResponse x : lists) {
            System.out.println(x.toString());
        }
    }
}
