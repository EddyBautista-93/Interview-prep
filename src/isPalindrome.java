
public class isPalindrome {

    // First i would make a method to return the string and checks if it is null or empty

    public static String reverse(String x){
        if(x.isEmpty() || x == null){
                return x;
        }
//        use charat and recurrsuin to get a reversed string
            return x.charAt(x.length()-1) + reverse(x.substring(0,x.length() - 1));
    }


    //checks to see if is palin use the built in method to return string, since we are worlomg
    public static boolean isPalin(String y){
        String reverse = reverse(y);

        if(y.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        System.out.println(isPalin("aaa"));
        System.out.println(isPalin("abc"));
        System.out.println(isPalin("bbbb"));
        System.out.println(isPalin("defg"));

    }

}
