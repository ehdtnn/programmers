package level1;

public class AcousticAdd {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i <absolutes.length; i++) {
            int a = absolutes[i];
            if (signs[i]) {
                answer += a;
                continue;
            }
            answer -= a;
        }
        return answer;
    }
}
