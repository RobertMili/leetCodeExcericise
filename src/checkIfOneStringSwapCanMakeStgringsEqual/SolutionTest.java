package checkIfOneStringSwapCanMakeStgringsEqual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void example1() {
        String s1 = "bank";
        String s2 = "kanb";

        assertEquals(true, solution.areAlmostEqual(s1, s2));
    }

    @Test
    void example2() {
        String s1 = "xlkrjiiklmmtezp";
        String s2 = "xnfbamkizybugtm";

        assertEquals(false, solution.areAlmostEqual(s1, s2));
    }

    @Test
    void example3() {
        String s1 = "bqzetqwrqegeupansshukcmnnezmooywwthvzkcciplknjfpzgpeybhuufoqnijzp";
        String s2 = "gcsozkpencquoypwbhhzptnwerkqjmbmtzeokanefjifguniznwyuupqqhelzpscv";

        assertEquals(false,solution.areAlmostEqual(s1,s2));
    }
    @Test
    void example4() {
        String s1 = "abcd";
        String s2 = "dcba";

        assertEquals(false,solution.areAlmostEqual(s1,s2));
    }
}