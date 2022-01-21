package level2;
public class ParenthesesConversion {
    public static void main(String[] args) {
        String p = "()))((()";
        String u = "";
        String v = "";

        int balance = 0;
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
        System.out.println("u : " + u);
        System.out.println("v : " + v);
        if (isCorrect(u)) {
            p = v;
        }
    }

    public static String recursive(String p) {
        String u = "";
        String v = "";
        int balance = 0;
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
        if (isCorrect(u)) {
            return recursive(v);
        } else {
            v = process(u);
        }
        return "";
    }

    public static String process(String u) {

        for (int i = 0; i < u.length(); i++) {
            char c = u.charAt(0);
        }
        return "";
    }

    public static boolean isBalanced(String u) {
        int balance = 0;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
        }
        return (balance == 0);
    }

    public static boolean isCorrect(String u) {
        int balance = 0;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                break;
            }
        }
        return (balance == 0);
    }

}
