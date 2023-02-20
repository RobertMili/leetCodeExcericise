package sumOfAllOddLenthSubarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
}
class Solution {
    public int sumOddLengthSubArrays(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {

                    list.add(arr[k]);
                }
                if(list.size() % 2 == 1) {
                    sum += list.stream().mapToInt(Integer::intValue).sum();
                }
                list.clear();
            }
        }

        return sum;
    }
}
