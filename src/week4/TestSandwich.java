package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestSandwich {
    @Test
    void checkMainIngredient() {
        Sandwich tunaSandwich = new Sandwich();
        tunaSandwich.setMainIngredient("tuna");
        tunaSandwich.setBreadType("white");
        tunaSandwich.setPrice(6.99);
        assertEquals("tuna", tunaSandwich.mainIngredient);
        assertEquals("tuna", tunaSandwich.getMainIngredient());
        assertEquals("white", tunaSandwich.breadType);
        assertEquals("white", tunaSandwich.getBreadType());
        assertEquals(6.99, tunaSandwich.price);
        assertEquals(6.99, tunaSandwich.getPrice());
    }
}
