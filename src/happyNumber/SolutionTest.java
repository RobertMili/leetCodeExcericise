package happyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void example1(){
        int test = 19;
        assertEquals(true,solution.isHappy(test));
    }
}