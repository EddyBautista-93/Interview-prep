public class Diff21 {

//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21

    static int diff21(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 21) {
            int result = 21 - n;
            return result;

        } else if(n > 21) {
            int result = n - 21;
            return result * 2;
        }
        return 21;
    }

    public static void main(String[] args) {
        System.out.println(diff21(21));
        System.out.println(diff21(10));
        System.out.println(diff21(0));
    }

}
