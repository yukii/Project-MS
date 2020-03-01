package ynov.project.blogproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.project.blogproject.proxies.MSUserProxy;
import ynov.project.blogproject.proxies.MSArticlesProxy;
import ynov.project.blogproject.proxies.MSCategoriesProxy;


import ynov.project.blogproject.model.*;

@Controller
public class HomeController {

    @Autowired
    private MSUserProxy userProxy;
    private MSArticlesProxy articleProxy;
    private MSCategoriesProxy categoriesProxy;
    
    @RequestMapping("/home")
    public String home(Model model) {
        return "Home";
    }
	
    @RequestMapping("/articles")
    public String article(Model articles) {
        List<Articles> articlesList =  articleProxy.getArticles();
        articles.addAttribute("articles", articlesList);
        
    	return "Articles";
    }
    
    @RequestMapping("/categories")
    public String categorie(Model categories) {
        List<Categories> categoriesList =  categoriesProxy.getCategories();
        categories.addAttribute("articles", categoriesList);
        
    	return "Categories";
    }
}
