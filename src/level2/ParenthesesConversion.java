package level2;
public class ParenthesesConversion {

    public static void main(String[] args) {
        String p1 = "(()())()";
        String p2 = ")(";
        String p3 = "()))((()";

        String res = solution(p1);
        System.out.println("res : " + res);
    }

    // 재귀함수 수정하기

    public static String solution(String p) {
        String answer = "";
        if (p.isEmpty()) {
            return "";
        }
        answer = getAnswer(p);
        return answer;
    }

    public static String getAnswer(String p ) {
        String u = "";
        String v = "";
        int balance = 0;
        String s = "";
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                u = p.substring(0, i+1);
                v = p.substring(i+1, p.length());
                break;
            }
        }
        System.out.println("u :" + u);
        System.out.println("v :" + v);

        // 올바른 문자열이면
        if (isCorrect(u)) {
            s = u + getAnswer(v);
            return s;
        }

        // 올바른 문자열이 아니면
        String newstr = "(";
        newstr += v;
        newstr += ")";

        return "";
    }

    public static String reverse(String u) {
        return removeFirstAndLast(u);
    }

    public static String removeFirstAndLast(String u) {
        return u.substring(1, u.length()-1);
    }

    public static boolean isCorrect(String u) {
        int balance = 0;
        boolean correct = true;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                correct = false;
                break;
            }
        }
        return correct;
    }

}
