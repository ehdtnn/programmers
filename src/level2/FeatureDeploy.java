package level2;

import java.util.ArrayList;
import java.util.List;

public class FeatureDeploy {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] count = new int[100];

        int deployDay = 0;
        for (int i = 0; i < progresses.length; i++) {
            int requiredDay = getRequiredDay(progresses[i], speeds[i]);
            if (deployDay < requiredDay) {
                count[requiredDay]++;
                deployDay = requiredDay;
            } else {
                count[deployDay]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            list.add(count[i]);
        }

        int size = list.size();
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int getRequiredDay(int p, int s) {
        int d = 1;
        while (100 > p + (s * d)) {
            d++;
        }
        return d;
    }
}
