import javax.sound.midi.Soundbank;

public class Main5 {
    public static void main(String[] args) {

        long a = Solution.solution(4);
        System.out.println(a);




    }
}

class Solution {
    static long q;

    public static long solution(long n) {
        long answer = 0;
        for(long a = 1; a <= n; a++) {
            if(n == a * a) {
                return answer = (a + 1) * (a + 1);
            }
        }
        return -1;
    }
}