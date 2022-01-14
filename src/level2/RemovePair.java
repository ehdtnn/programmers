package level2;

public class RemovePair {
    public int solution(String s) {
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                return -1;
            }
            if (s.charAt(i) == s.charAt(i+1)) {
                s = s.substring(2, s.length());
            }
        }

        //test();

        return answer;
    }

    public static void test() {
        String str = "abc";
        System.out.println(str.substring(2, str.length()));
    }
}
