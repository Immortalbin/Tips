import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class MergeSortTest {

    @Test
    public void testSort() {
        int[] testArr = new int[]{90, -2, 9, 0};
        int[] expected = new int[]{-2, 0, 9, 90};
        MergeSort.sort(testArr);
        assertEquals(testArr, expected);
    }
}