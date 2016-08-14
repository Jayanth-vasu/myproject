package com.niit.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.model.FileUtil;
import com.niit.shopping.model.ProductDetails;

import com.niit.shopping.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	

	private String path = "G:\\Java programs\\eclipse\\JEE files\\jvsmartwatches\\src\\main\\webapp\\resources\\img";

	@ModelAttribute("smartproducts")
	public ProductDetails getproduct() {
		return new ProductDetails();
	}
	
	/*@ModelAttribute("command")
	public ProductDetails updatedproduct() {
		return new ProductDetails();
	}*/

	@RequestMapping("/product")

	public String listPersons(Model model) {

		model.addAttribute("listProducts", productService.listProducts());
		return "product";
	}

	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("smartproducts") ProductDetails productDetails) {

		/*MultipartFile file = productDetails.getImage();

		FileUtil.upload(path, file, productDetails.getImage() + ".jpg");*/

		
		

		if (productDetails.getProduct_id() == 0) {

			productService.addProduct(productDetails);
		} else {

			productService.updateProduct(productDetails);
		}

		return "redirect:/product";
	}

	@RequestMapping("/remove/{product_id}")
	public String removeProduct(@PathVariable("product_id") int product_id,Model model) {

		productService.removeProduct(product_id);
		model.addAttribute("listProducts", productService.listProducts());
		return "productList";
	}

	@RequestMapping("/edit/{product_id}")
	public ModelAndView editProduct(@PathVariable("product_id") int product_id) {
		ProductDetails productDetails=productService.getProductById(product_id);
		return new ModelAndView("editproduct","smartproducts",productDetails);
		
		
	}

	@RequestMapping("/viewall")
	public String viewall(Model model) {
		model.addAttribute("listProducts", productService.listProducts());
		return "productList";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("smartproducts") ProductDetails productDetails,Model model) {
		productService.updateProduct(productDetails);
		
		model.addAttribute("listProducts",productService.listProducts());
		return "productList";
	}
}
