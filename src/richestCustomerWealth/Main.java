package richestCustomerWealth;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
    public int maximuWealth(int[][] accounts) {
        List<Integer> list = new ArrayList<>();

        int element = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {

               element += accounts[i][j];

            }
            list.add(element);
            element = 0;
            System.out.println(" ");
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
        return list.stream().max(Integer::compareTo).get().intValue();
    }
}
