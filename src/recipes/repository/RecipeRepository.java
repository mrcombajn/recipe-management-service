package recipes.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import recipes.entities.Recipe;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    private final List<Recipe> recipes = new ArrayList<>();

    public Recipe getRecipeById(int id) {
        return recipes.get(id);
    }

    public void saveRecipe(String json) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Recipe recipe = objectMapper.readValue(json, Recipe.class);

            recipes.add(recipe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
