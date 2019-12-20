import java.util.stream.IntStream;

public class Fizzbuzz {

    // Getitng the multiples to get fibuzz
    public static void fizzBuzzBeforeJava8(int num){
        for(int i = 1; i <=num; i++){
            if(((i % 5) == 0) && ((i % 7) == 0)){
                System.out.println("Fizzbuzz");
            } else if((i % 5) == 0){
                System.out.println("Fizz");
            } else if((i % 7) == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzzInJava8(int num){
    //Returns a stream consisting of the distinct elements of this stream.
        IntStream.rangeClosed(1,100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        fizzBuzzBeforeJava8(100);
        fizzBuzzInJava8(100);
    }

}
