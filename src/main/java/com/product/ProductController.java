package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public String boardlist(Model model) {
        model.addAttribute("list", productService.getProductList());
        return "list";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value = "/product/addok", method = RequestMethod.POST)
    public String addPostOK(ProductVO vo){
        int i = productService.insertProduct(vo);
        if(i == 0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!");
        return "redirect:list";
    }

    @RequestMapping(value = "/product/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        ProductVO vo = productService.getProduct(id);
        model.addAttribute("boardVO", vo);
        return "editform";
    }

    @RequestMapping(value = "/product/editok", method = RequestMethod.POST)
    public String editPostOK(ProductVO vo){
        int i = productService.updateProduct(vo);
        if(i == 0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공!");
        return "redirect:list";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return "redirect:../product/list";
    }
}