import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    String name = "name";
    float price = 100;
    Bun bun = new Bun(name, price);

    @Test
    public void getNameTest(){
        String actual = bun.getName();
        assertEquals(name, actual);
    }

    @Test
    public void getPriceTest(){
        float actual = bun.getPrice();
        assertEquals(price, actual, 0);
    }
}
