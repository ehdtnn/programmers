package level1;

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int pre = 10;
        for (int num : arr) {
            if (num == pre) {
                continue;
            }
            list.add(num);
            pre = num;
        }
        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
