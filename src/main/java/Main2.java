class Main2 {
    public static void main(String[] args) {

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2 = Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55

        int 결과3 = Math.nToMSum(2, 3);
        System.out.println("결과3 : " + 결과3);

        int 결과4 = Math.nToMSum(5, 10);
        System.out.println("결과4 : " + 결과4);


    }
}

class Math {

    static int i = 1;

    static int oneToSum(int a) {
        int b = 0;
        int c = 0;
        while (b <= a) {
            c = c + b;
            b++;
        }
        return c;
    }

    static int nToMSum(int a, int b) {
        int c = 0;
        while (a <= b) {
            c += a;
            a++;
        }
        return c;
    }
}
