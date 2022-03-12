package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Marko Bekhta
 */
public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimesTest {
    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(
                new int[]{20, 37, 21},
                DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes.deleteNth(new int[]{}, 5)
        );
    }
}