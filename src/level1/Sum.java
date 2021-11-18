package level1;

public class Sum {
    public long solution(int a, int b) {
        long answer = 0;
        int bigger = 0;
        int smaller = 0;

        if (a - b > 0) {
            bigger = a;
            smaller = b;
        } else if (a - b < 0) {
            bigger = b;
            smaller = a;
        } else {
            return a;
        }

        answer = (  bigger * (bigger + 1) / 2) - smaller;
        return answer;
    }
}
