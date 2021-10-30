package level1;

import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int height = board.length; // 정사각형
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int line = moves[i] - 1;

            // 층별로 체크
            for (int h = 0; h < height; h++) {
                int value = board[h][line];

                // 인형 있으면 뽑는다
                if (value != 0) {
                    board[h][line] = 0;

                    // 바구니에 넣는다
                    if (addBagAndCheckCrush(stack, value)) {
                        answer += 2;
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public boolean addBagAndCheckCrush(Stack<Integer> stack, int value) {
        // 빈 바구니면 그냥 넣는다
        if (stack.isEmpty()) {
            stack.push(value);
            return false;
        }

        // 맨 위의 인형과 비교해서 같으면 터트린다
        int top = stack.peek();
        if (top == value) {
            stack.pop();
            return true;
        } else {
            // 다르면 그냥 넣는다.
            stack.push(value);
            return false;
        }
    }
}
