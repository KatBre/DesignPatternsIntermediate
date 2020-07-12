package decorator.ex2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class SimplePizza implements IPizza {
    private List<String> ingredientsList;
    private double price;

    public SimplePizza() {
        this.ingredientsList.addAll(Arrays.asList("sauce", "cheese"));
    }

    @Override
    public List<String> getIngredients() {
        return getIngredientsList();
    }
    @Override
    public double getPrice() {
        return price;
    }
}
