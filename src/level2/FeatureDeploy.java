package level2;

public class FeatureDeploy {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[100];

        int min = getRequiredDay(progresses[0], speeds[0]);
        for (int i = 1; i < progresses.length; i++) {
            int requiredDay = getRequiredDay(progresses[i], speeds[i]);


            // if (i == 0) {
            //     min = requiredDay;
            //     days[requiredDay] += 1;
            //     continue;
            // }
            // if (min <= requiredDay) {
            //     days[requiredDay] += 1;
            // } else {
            //     days[min] += 1;
            //     min = requiredDay;
            // }
        }

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 0) {
                continue;
            }
            System.out.println("d : " + days[i]);
        }

        return answer;
    }

    public int getRequiredDay(int p, int s) {
        int d = 1;
        while (100 > p + (s * d)) {
            d++;
        }
        return d;
    }
}
