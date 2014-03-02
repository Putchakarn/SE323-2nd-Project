package cbsd.lab11.controller;

import cbsd.lab11.entity.Category;
import cbsd.lab11.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by nuico_000 on 2/27/14.
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @RequestMapping(value= "list", method = RequestMethod.GET)
    public String listCategory(ModelMap model){
        List<Category> categories = categoryService.getCategories();

        model.addAttribute("categories",categories);
        return "categoryList";
    }


    @RequestMapping(value = "categoryDetail/id/{id}",method = RequestMethod.GET)
    public String printInputName(@PathVariable("id")Long id , ModelMap model){
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "categoryDetail";
    }

}