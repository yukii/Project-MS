package ynov.project.blogproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.project.blogproject.proxies.MSUserProxy;
@Controller
public class HomeController {

    @Autowired
    private MSUserProxy userProxy; // faire pour les categories, articles ....

    @RequestMapping("/home")
    public String home(Model model){
    	// mettre la liste des catégories
    	
        return "Home";
    }
	
}
