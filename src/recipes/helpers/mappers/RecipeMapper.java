package recipes.helpers.mappers;

import recipes.controllers.requests.RecipeRequest;
import recipes.entities.Recipe;

public class RecipeMapper {

    public static Recipe createRecipeFromRequest(RecipeRequest recipeRequest) {
        return new Recipe(recipeRequest.getName(), recipeRequest.getDescription(), recipeRequest.getIngredients(), recipeRequest.getDirections());
    }

    public static RecipeRequest createRequestFromRecipe(Recipe recipe) {
        return new RecipeRequest(recipe.getName(), recipe.getDescription(), recipe.getIngredients(), recipe.getDirections());
    }
}
