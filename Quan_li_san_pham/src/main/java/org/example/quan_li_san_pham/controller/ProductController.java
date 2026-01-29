package org.example.quan_li_san_pham.controller;

import org.example.quan_li_san_pham.entity.Product;
import org.example.quan_li_san_pham.service.IProductService;
import org.example.quan_li_san_pham.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    private IProductService productService = new ProductService();

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("product", new ProductController());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute(name = "product") Product product) {
        productService.update(product.getId(), product);
        return "redirect:/products";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        productService.remove(id);
        return "redirect:/products";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model) {
        model.addAttribute("products", productService.findByName(name));
        return "list";
    }
}
