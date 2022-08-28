import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class DatabaseTest{
    private Database database;

    @Before
    public void setUp(){
        database = new Database();
    }

    @Test
    public void availableBunsTest(){
        List<Bun> actualBunList = database.availableBuns();
        assertNotNull(actualBunList);
    }

    @Test
    public void availableIngredientsTest(){
        List<Ingredient> actualIngredientList = database.availableIngredients();
        assertNotNull(actualIngredientList);
    }
}
