package decorator.ex2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CustomPizza implements IPizza {
    private final IPizza basePizza;
    private List<String> additionalIngredientsList;

    public CustomPizza(IPizza simplePizza) {
        this.basePizza = simplePizza;
    }
    public CustomPizza(IPizza basePizza, String... additionalIngredients) {
        this.basePizza = basePizza;
        this.additionalIngredientsList.addAll(Arrays.asList(additionalIngredients));
    }

    public void addIngredients(String ingredient) {
        additionalIngredientsList.add(ingredient);
    }

    @Override
    public List<String> getIngredients() {
        List<String> allIngredients = new ArrayList<>(additionalIngredientsList);
        allIngredients.addAll((basePizza.getIngredients()));
        return allIngredients;
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + (additionalIngredientsList.size() * 2.5);
    }
}
