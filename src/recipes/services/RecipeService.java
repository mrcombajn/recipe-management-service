package recipes.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import recipes.controllers.requests.RecipeRequest;
import recipes.entities.Recipe;
import recipes.helpers.mappers.RecipeMapper;
import recipes.repository.RecipeRepository;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    public RecipeRequest getRecipeById(int id) {
        return RecipeMapper.createRequestFromRecipe(recipeRepository.getRecipeById(id));
    }

    public Map<String, Integer> saveRecipe(RecipeRequest recipeRequest) {
        Recipe recipe = RecipeMapper.createRecipeFromRequest(recipeRequest);

        return Map.of("id", recipeRepository.saveRecipe(recipe));
    }
}
