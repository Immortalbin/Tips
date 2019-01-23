import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class QuickSortTest {

    @Test
    public void testSort() {
        Integer[] testArr = new Integer[]{90, -2, 9, 0};
        Integer[] expected = new Integer[]{-2, 0, 9, 90};
        QuickSort.sort(testArr);
        assertEquals(testArr, expected);
    }
}