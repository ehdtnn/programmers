package level1;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        // 맞춘 개수와 가려진 숫자의 개수
        int winningCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    winningCount++;
                }
            }
        }

        // 순위
        answer[0] = getWinningOrder(winningCount + zeroCount);
        answer[1] = getWinningOrder(winningCount);

        return answer;
    }

    public static int getWinningOrder(int winningCount) {
        if (winningCount == 6) {
            return 1;
        } else if (winningCount == 5) {
            return 2;
        } else if (winningCount == 4) {
            return 3;
        } else if (winningCount == 3) {
            return 4;
        } else if (winningCount == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
