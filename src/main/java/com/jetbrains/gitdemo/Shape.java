package com.jetbrains.gitdemo;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

class SquareTest {
    @Test
    void shoudHaveFourCorners(Object expected) {
         // given
         var square = new Square;

         // expect
         Assertions.assertEquals( expected: 4, square.getNumberOfVertices());
    }

    @Disabled("Not implementend")
    @Test
    void shouldConsistOfFourSides() {
        // given
        var square = new square();

        // expect
    }
}