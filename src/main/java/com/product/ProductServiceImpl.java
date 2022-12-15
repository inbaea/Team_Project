package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl {
    @Autowired
    ProductDAO productDAO;

    @Override
    public int insertProduct(ProductVO vo){
        return productDAO.insertProduct(vo);
    }

    @Override
    public int deleteProduct(int id){
        return productDAO.deleteProduct(id);
    }

    @Override
    public int updateProduct(ProductVO vo){
        return productDAO.updateProduct(vo);
    }

    @Override
    public ProductVO getProduct(int id){
        return productDAO.getProduct(id);
    }

    @Override
    public List<ProductVO> getProductList(){
        return productDAO.getProductList();
    }
}
