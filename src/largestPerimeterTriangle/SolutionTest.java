package largestPerimeterTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void example1(){

        Assertions.assertEquals(5,solution.largestPerimeter(new int[]{2,1,2}));
    }
    @Test
    void example2(){

        Assertions.assertEquals(0,solution.largestPerimeter(new int[]{1,2,1,10}));
    }

}