package canMakeArithmeticProgressionFromSquence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void example1() {
        int[] arr = {3, 5, 1};

        assertEquals(true, solution.canMakeArithmeticProgression(arr));
    }

    @Test
    void example2() {
        int[] arr = {1,100};

        assertEquals(true, solution.canMakeArithmeticProgression(arr));
    }
    @Test
    void example3(){
        int [] arr= {-13,-17,-8,-10,-20,2,3,-19,2,-18,-5,7,-12,18,-17,12,-1};

        assertEquals(false,solution.canMakeArithmeticProgression(arr));
    }

}