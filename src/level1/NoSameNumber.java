package level1;

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        // 연속적인 숫자 제거
        if (arr.length > 0) {
            list.add(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                continue;
            } else {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();

    }
}
