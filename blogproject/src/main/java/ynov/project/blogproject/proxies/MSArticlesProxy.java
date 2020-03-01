package ynov.project.blogproject.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ynov.project.blogproject.model.Articles;

@FeignClient(name = "articles-ms")
@RibbonClient(name= "articles-ms")
public interface MSArticlesProxy {

	@GetMapping(value = "/articles")
	List<Articles> getArticles();
		
	@GetMapping( value = "/articles/{id}")
	Optional<Articles> getArticles(@PathVariable("id") Long id);

}
