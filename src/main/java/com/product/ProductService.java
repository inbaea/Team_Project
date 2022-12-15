package com.product;

import java.util.List;

public interface ProductService {
    public int insertProduct(ProductVO vo);
    public int deleteProduct(int id);
    public int updateProduct(ProductVO vo);
    public ProductVO getProduct(int id);
    public List<ProductVO> getProductList();
}
