package level1;

import java.util.*;

public class GymSuit {

    class Solution {
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

            // test();

            int reserveCount = 0;

            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (isReservable(list1.get(i), list2.get(j))) {
                        list2.set(j, -1);
                        reserveCount++;
                        break;
                    }
                }
            }

            // for (int i = 0; i < lost.length; i++) {
            //     for (int j = 0; j < reserve.length; j++) {
            //         if (isReservable(lost[i], reserve[j])) {
            //             reserve[j] = -1;
            //             reserveCount++;
            //             break;
            //         }
            //     }
            // }

            answer = n - list1.size() + reserveCount;

            return answer;
        }

        public void test() {
            // expected true
            System.out.println(isReservable(0, 0));

            // expected true
            System.out.println(isReservable(0, 1));

            // expected true
            System.out.println(isReservable(1, 0));

            // expected false
            System.out.println(isReservable(0, 2));

            // expected false
            System.out.println(isReservable(2, 0));
        }

        public boolean isReservable(int a, int b) {
            return (Math.abs(a-b) <= 1);
        }


    }
}
