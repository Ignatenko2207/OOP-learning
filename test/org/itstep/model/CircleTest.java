package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle();
        double testData = circle.getArea();
        Assertions.assertEquals(314.1592, testData, 0.001);
    }
}