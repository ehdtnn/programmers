package level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c + n <= 'Z') {
                    c = (char)(c + n);
                } else {
                    c = (char)(c + n - 90 + 64);
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c + n <= 'z') {
                    c = (char)(c + n);
                } else {
                    c = (char)(c + n - 122 + 96);
                }
            }
            answer += c;
        }
        return answer;
    }
}
