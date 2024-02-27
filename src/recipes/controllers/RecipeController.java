package recipes.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recipes.entities.Recipe;
import recipes.services.RecipeService;

@RestController
@RequestMapping("/api/recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable int id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    public void writeSingleRecipe(@RequestBody String json) {
        recipeService.saveRecipe(json);
    }
}
