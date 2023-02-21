package matrixDiagonalSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void example(){

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        assertEquals(25,solution.diagonalSum(arr));
    }

}