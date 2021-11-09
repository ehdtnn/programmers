package level1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;

        for (int i = 0; i < answers.length; i++) {
            // check
            if (a[aIndex] == answers[i]) {
                aCount++;
            }
            if (b[bIndex] == answers[i]) {
                bCount++;
            }
            if (c[bIndex] == answers[i]) {
                cCount++;
            }

            // index init
            if (aIndex != 0 && i % a.length-1 == 0){
                aIndex = 0;
            }
            if (bIndex != 0 && i % b.length-1 == 0){
                bIndex = 0;
            }
            if (cIndex != 0 && i % c.length-1 == 0) {
                cIndex = 0;
            }

            // next index
            aIndex++;
            bIndex++;
            cIndex++;
        }

        return answer;
    }

}
