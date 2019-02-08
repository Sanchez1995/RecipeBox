package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService {

	@Inject
	private RecipeRepository repo;

	public String createRecipe(String recipe) {
		if (recipe.contains("Bacon")) {

			return "Can't Add This Recipe";
		}
		return repo.createRecipe(recipe);
	}

	public String getAllRecipes() {
	
		return repo.getAllRecipes();
	}

	public String getARecipe(Long id) {
	
		return repo.getARecipe(id);
	}

	public String updateRecipe(String recipe, Long id) {
		
		return repo.updateRecipe(recipe, id);
	}

	public String deleteRecipe(Long id) {
	
		return repo.deleteRecipe(id);
	}

	public int cycleRecipes(String title) {
	
		return repo.cycleRecipes(title);
	}

}
