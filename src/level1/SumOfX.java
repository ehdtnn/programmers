package level1;

public class SumOfX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long xx = x;
        for (int i = 0; i < n; i++) {
            answer[i] = xx * (i + 1);
        }

        return answer;
    }
}
