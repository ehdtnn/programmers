package level1;

public class PrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;

        for (int i = 0; i < len-2; i++) {
            int t = nums[i];
            for (int j = i+1; j < len-1; j++) {
                int t2 = t + nums[j];
                for (int k = j+1; k < len; k++) {
                    int t3 = t2 + nums[k];
                    if (isPrime(t3)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
