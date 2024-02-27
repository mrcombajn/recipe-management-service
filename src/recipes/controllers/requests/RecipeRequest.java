package recipes.controllers.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RecipeRequest {

    private final String name;

    private final String description;

    private final String[] ingredients;

    private final String[] directions;
}
