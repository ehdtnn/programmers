package level1;

public class Collatz {
    int solution(int num) {
        int answer = 0;
        long number = num;

        while (number != 1) {
            if (answer == 500) {
                return -1;
            }
            answer++;
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
        }
        return answer;
    }
}
