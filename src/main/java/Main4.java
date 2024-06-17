public class Main4 {
    public static void main(String[] args) {
        boolean rs = Math3.is_even_number(2);
        System.out.println(rs);

        rs =Math3.is_even_number(3);
        System.out.println(rs);
    }
}

class Math3 {

    static boolean is_even_number(int a) {
        return a % 2 == 0;
    }
}
