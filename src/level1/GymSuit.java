package level1;

import java.util.*;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < lost.length; i++) {
            list1.add(lost[i]);
        }
        for (int i = 0; i < reserve.length; i++) {
            list2.add(reserve[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);

        int reserveCount = 0;

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    list1.set(i, -1);
                    list2.set(j, -1);
                    reserveCount++;
                    break;
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == -1) {
                continue;
            }
            for (int j = 0; j < list2.size(); j++) {
                if (isReservable(list1.get(i), list2.get(j))) {
                    list2.set(j, -1);
                    reserveCount++;
                    break;
                }
            }
        }

        answer = n - list1.size() + reserveCount;
        return answer;
    }

    public boolean isReservable(int a, int b) {
        return (Math.abs(a-b) == 1);
    }

}
