package ynov.project.blogproject.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ynov.project.blogproject.model.Categories;

@FeignClient(name = "categories-ms")
@RibbonClient(name= "categories-ms")
public interface MSCategoriesProxy {

	@GetMapping(value = "/categories")
	List<Categories> getCategories();
		
	@GetMapping( value = "/categories/{id}")
	Optional<Categories> getCategorie(@PathVariable("id") Long id);

}
