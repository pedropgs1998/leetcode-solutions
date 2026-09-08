package com.pedro.leetcode;

import com.pedrosilva.leetcode.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumTest {

    @Test
    void case1() {
        TwoSum solucao = new TwoSum();

        int[] result = solucao.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void case2() {
        TwoSum solucao = new TwoSum();

        assertThrows(IllegalArgumentException.class, () ->
                solucao.twoSum(new int[]{2, 5, 11, 15}, 9)
        );
    }
}