package level2;

public class RemovePair {

    public static void main(String[] args) {
        RemovePair.solution("baabaa");
    }

    public static int solution(String s) {
        int answer = -1;


        System.out.println(s.substring(0, 1) + s.substring(3,6));


        return answer;
    }

    public static String extract(String str, int index) {
        String head = str.substring(1, index);
        System.out.println(head);
        String tail = str.substring(index+1, index+1+1);
        System.out.println(tail);
        return head + tail;
    }
}
