package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SequenceTest {
    @Test
    public void longSequence() {
        int[] nums = {1, 2, 3, 3, 4, 1, 5, 5, 5, 5, 5, 1};
        Sequence sequence = new Sequence();
        int result = sequence.findSequence(nums);
        assertEquals(5, result);
    }
    @Test
    public void nullSequence() {
        int[] nums = {};
        Sequence sequence = new Sequence();
        int result = sequence.findSequence(nums);
        assertEquals(0, result);
    }
    @Test
    public void shortSequence() {
        int[] nums = {1, 2, 2, 3, 4};
        Sequence sequence = new Sequence();
        int result = sequence.findSequence(nums);
        assertEquals(2, result);
    }
}