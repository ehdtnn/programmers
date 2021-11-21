package level1;

import java.util.HashMap;
import java.util.Map;

public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        Position left = new Position(3,0);
        Position right = new Position(3,2);

        Map<Integer, Position> dial = makeDial();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            Position dst = dial.get(number);

            int l = getDistance(left, dst);
            int r = getDistance(right, dst);

            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                left = new Position(dst.getX(), dst.getY());
                continue;
            }

            if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                right = new Position(dst.getX(), dst.getY());
                continue;
            }


            if (l < r) {
                left = new Position(dst.getX(), dst.getY());
                answer += "L";
            } else if (r < l) {
                right = new Position(dst.getX(), dst.getY());
                answer += "R";
            } else {
                if ("right".equals(hand)) {
                    right = new Position(dst.getX(), dst.getY());
                    answer += "R";
                } else{
                    left = new Position(dst.getX(), dst.getY());
                    answer += "L";
                }
            }
        }


        return answer;
    }

    public int getDistance(Position src, Position dst) {
        int d = Math.abs(src.getX() - dst.getX()) + Math.abs(src.getY() - dst.getY());
        return d;
    }

    public Map<Integer, Position> makeDial() {
        Map<Integer, Position> dial = new HashMap<>();
        int[] keys = {1,2,3,4,5,6,7,8,9,10,0,11};
        int x = 0;
        int y = 0;
        for (int i = 0; i < keys.length; i++) {
            if (y == 3) {
                y = 0;
                x++;
            }
            dial.put(keys[i], new Position(x, y));
            y++;
        }
        return dial;
    }

    class Position {
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x="+x+", y="+y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
