package level1;

public class MaskingPhone {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i ++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
    /*
    public String solution(String phone_number) {
        String answer = "";
        String regex = phone_number.substring(0, phone_number.length()-4);
        String replace = "";
        for (int i = 0; i < regex.length(); i++) {
            replace += "*";
        }
        answer = phone_number.replaceAll(regex, replace);
        return answer;
    }
    */
}
