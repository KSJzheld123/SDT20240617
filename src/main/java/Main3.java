public class Main3 {
    public static void main(String[] args) {

        boolean rs = Math2.one_to_n_prime_numbers(1);
        System.out.println("1은(는) 소수인가? : " + rs);

        rs = Math2.one_to_n_prime_numbers(2);
        System.out.println("2은(는) 소수인가? : " + rs);

        rs = Math2.one_to_n_prime_numbers(4);
        System.out.println("4은(는) 소수인가? : " + rs);

        rs = Math2.one_to_n_prime_numbers(7);
        System.out.println("7은(는) 소수인가? : " + rs);
    }
}

class Math2 {
    static boolean one_to_n_prime_numbers(int a) {
        if (a == 1) {
            return false;
        }
        for (int b = 2; b < a; b++) {
            if (a % b == 0) {
                return true;
            }
        }
        return false;
    }
}
