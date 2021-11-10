package level1;

public class MiddleCharacter {
    public String solution(String s) {
        String answer = "";
        int center = 0;
        if (s.length() % 2 == 0) {
            center = (s.length() / 2) - 1;
            answer += s.charAt(center);
            answer += s.charAt(center+1);
        } else {
            center = (s.length() / 2);
            answer += s.charAt(center);
        }
        return answer;
    }
}
