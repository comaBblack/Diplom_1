import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import org.apache.commons.lang3.RandomStringUtils;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"✌️", -99999999F},
                {"",99999999F},
                {null,0},
                {RandomStringUtils.randomAlphabetic(100),0.1F},
        };
    }

    @Test
    public void getNameTest(){
        Bun bun = new Bun(name, price);
        String actual = bun.getName();
        assertEquals(name, actual);
    }

    @Test
    public void getPriceTest(){
        Bun bun = new Bun(name, price);
        float actual = bun.getPrice();
        assertEquals(price, actual, 0);
    }
}
