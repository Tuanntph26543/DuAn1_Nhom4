/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.service;

import com.poly.it17323.domainmodel.Product;
import com.poly.it17323.response.ProductResponse;
import com.poly.it17323.repository.ProductRepository;
import java.util.List;

/**
 *
 * @author My PC
 */
public interface QuanLyProductService {
    List<ProductResponse> getAllProducts();
}
