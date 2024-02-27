package recipes.repository;

import org.springframework.stereotype.Repository;
import recipes.entities.Recipe;
import recipes.entities.exceptions.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    private final List<Recipe> recipes = new ArrayList<>();

    public Recipe getRecipeById(int id) {
        try {
            return recipes.get(id);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EntityNotFoundException("(Not found)");
        }
    }

    public int saveRecipe(Recipe recipe) {
        recipes.add(recipe);

        return recipes.indexOf(recipe);
    }
}
