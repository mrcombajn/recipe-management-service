package recipes.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import recipes.entities.Recipe;
import recipes.entities.exceptions.EntityNotFoundException;
import recipes.repository.RecipeRepository;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    public Recipe getRecipeById(int id) {
        try {
            return recipeRepository.getRecipeById(id);
        }
        catch (Exception e) {
            throw new EntityNotFoundException("(Not found)");
        }
    }

    public void saveRecipe(String json) {
        recipeRepository.saveRecipe(json);
    }
}
