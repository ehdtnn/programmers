package level2;

public class NatinoOf124 {
    public String solution(int n) {
        String answer = "";

        String answer = "";

        if (n <= 2) {
            return Integer.toString(n);
        }

        int i = 0;
        int num = 3;
        while (true) {
            if (n <= Math.pow(3, i)) {
                break;
            }
            i++;
        }

        System.out.println("i : " + i);

        return answer;


        return answer;
    }
}
