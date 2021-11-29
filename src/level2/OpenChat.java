package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {
    public String[] solution(String[] record) {
        String[] answer = {};
        int changeCount = 0;

        // make map
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String type = record[i].split(" ")[0];
            if (type.equals("Change")) {
                changeCount++;
            }
            if (type.equals("Leave")) {
                continue;
            }
            String uid = record[i].split(" ")[1];
            String uname = record[i].split(" ")[2];
            map.put(uid, uname);
        }

        // make list;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String type = record[i].split(" ")[0];
            String uid = record[i].split(" ")[1];
            if (type.equals("Change")) {
                continue;
            } else if (type.equals("Enter")) {
                list.add(map.get(uid) + "님이 들어왔습니다.");
            } else {
                list.add(map.get(uid) + "님이 나갔습니다.");
            }
        }

        // list to answer
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
