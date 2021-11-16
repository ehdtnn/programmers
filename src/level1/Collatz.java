package level1;

public class Collatz {
    public int solution(int num) {
        int answer = 0;

        if (num == 1) {
            return num;
        }

        int i = 1;
        while (num != 1) {
            if (i == 500) {
                num = -1;
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            i++;
            System.out.println("num : " + num);
        }
        answer = num;
        System.out.println("answer : " + answer);
        return answer;
    }
}
