package controller;

import at.fhtw.bic.markingapifhtw.controller.MarketingApifhtwController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketingApifhtwControllerTest {

    @Test
    void calculateMark(){

        var controller = new MarketingApifhtwController();
        var result = controller.calculateMark(-10);
        var result2 = controller.calculateMark(45);
        var result3 = controller.calculateMark(60);
        var result4 = controller.calculateMark(72);
        var result5 = controller.calculateMark(82);
        var result6 = controller.calculateMark(99);

        assertEquals(0, result);
        assertEquals(5, result2);
        assertEquals(4, result3);
        assertEquals(3, result4);
        assertEquals(2, result5);
        assertEquals(1, result6);

    }

}