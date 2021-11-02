package level1;

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

            if (i % a.length == 0) {
                aIndex = 0;
            }
            if (i % b.length == 0) {
                bIndex = 0;
            }
            if (i % c.length == 0) {
                cIndex = 0;
            }

            if (a[aIndex] == answers[i]) {
                aCount++;
            }
            if (b[bIndex] == answers[i]) {
                bCount++;
            }
            if (c[cIndex] == answers[i]) {
                cCount++;
            }

            aIndex++;
            bIndex++;
            cIndex++;
        }

        System.out.println(aCount);
        System.out.println(bCount);
        System.out.println(cCount);

        return answer;
    }
}
