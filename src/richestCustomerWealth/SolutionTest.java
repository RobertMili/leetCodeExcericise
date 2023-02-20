package richestCustomerWealth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void example1(){
        int[][] arr = {{1,2,3},{3,2,1}};

        assertEquals(6,solution.maximuWealth(arr));
    }

}