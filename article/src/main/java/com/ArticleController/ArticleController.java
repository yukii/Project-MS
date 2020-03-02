package com.ArticleController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController<Article1> {
	@RequestMapping(value="/Articles", method=RequestMethod.GET)
	public String listeArticles() {
		return "Un exemple d'articles";
	
}
		
	@RequestMapping(value="/Articles/{id}", method=RequestMethod.GET)
	public String afficherUnArticle(@PathVariable int id) {
		return "vous avez demande un article avec l'id" + id;
	}
	
	@GetMapping(value = "/Articles/{id}")
	public Article1 afficherUnArticle1(@PathVariable int id) {
		Article1 article=newArticle1(id, new String("Article1"), 100);
		return article;
	}

	private Article1 newArticle1(int id, String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
