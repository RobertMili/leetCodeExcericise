package sumOfAllOddLenthSubarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void example1(){
        int[] arr = {1,4,2,5,3};

        assertEquals(58,solution.sumOddLengthSubArrays(arr));
    }
    @Test
    void example2(){
        int[] arr = {10,11,12};

        assertEquals(66,solution.sumOddLengthSubArrays(arr));
    }

}