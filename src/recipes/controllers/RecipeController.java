package recipes.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.controllers.requests.RecipeRequest;
import recipes.services.RecipeService;

import java.util.Map;

@RestController
@RequestMapping("/api/recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<RecipeRequest> getRecipeById(@PathVariable int id) {
            return ResponseEntity.ok(recipeService.getRecipeById(id));
    }

    @PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Map<String, Integer>> saveSingleRecipe(@RequestBody RecipeRequest recipeRequest) {
        return ResponseEntity
                .ok(recipeService.saveRecipe(recipeRequest));
    }
}
