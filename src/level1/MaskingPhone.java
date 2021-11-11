package level1;

public class MaskingPhone {
    public String solution(String phone_number) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {

        String str = "01092460054";
        String masking = str.substring(0, str.length()-4);
        String a = "";
        for (int i = 0; i < masking.length(); i++) {
            a+= "*";
        }
        String b = str.replaceAll(masking, "*");
        System.out.println(a);
    }
}
