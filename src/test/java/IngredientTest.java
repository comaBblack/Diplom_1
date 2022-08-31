import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final IngredientType ingredientType;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType ingredientType, String name, float price) {
        this.ingredientType = ingredientType;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getIngredients() {
        return new Object[][]{
                {SAUCE, "sjhf", 500f},
                {FILLING, "sdkfbsdkf", 700.10f},
                {FILLING,"✌️", -99999999F},
                {SAUCE,"",99999999F},
                {FILLING,null,0},
                {SAUCE,RandomStringUtils.randomAlphabetic(100),0.1F},
        };
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(ingredientType, name, price);
        IngredientType actualType = ingredient.getType();
        assertEquals("Incorrect type", ingredientType, actualType);
    }

    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(ingredientType, name, price);
        String actualName = ingredient.getName();
        assertEquals("Incorrect name", name, actualName);
    }

    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(ingredientType, name, price);
        float actualPrice = ingredient.getPrice();
        assertEquals("Incorrect price", price, actualPrice, 0);
    }

}
