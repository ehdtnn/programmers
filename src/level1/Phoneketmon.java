package level1;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        answer = set.size();

        if (answer >= max) {
            answer = max;
        }

        return answer;
    }
}
