package com.product;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDAO {

    @Autowired
    SqlSession sqlSession;

    public int insertProduct(ProductVO vo){
        int result = sqlSession.insert("Product.insertProduct", vo);
        return result;
    }

    public int deleteProduct(int id){
        int result = sqlSession.delete("Product.deleteProduct", id);
        return result;
    }

    public int updateProduct(ProductVO vo){
        int result = sqlSession.update("Product.updeteProduct", vo);
        return result;
    }

    public ProductVO getProduct(int id){
        ProductVO result = sqlSession.selectOne("Product.getProduct", id);
        return result;
    }

    public List<ProductVO> getProductList(){
        List<ProductVO> list = sqlSession.selectList("Product.getProductList");
        return list;
    }
}
