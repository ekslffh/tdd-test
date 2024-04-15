package org.example.customer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈가스", 5000);

        Cook cook = cooking.makeCook(menuItem);

        Assertions.assertEquals(new Cook("돈가스", 5000), cook);
    }
}
