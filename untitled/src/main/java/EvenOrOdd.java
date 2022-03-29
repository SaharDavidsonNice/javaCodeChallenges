import java.util.Scanner;


public class EvenOrOdd {


    static boolean isEven(int userNum) {
        return userNum % 2 == 0;
    }



    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: " );
        int userNum = scanner.nextInt();
        System.out.println("is the number even? " + isEven(userNum) );

    }


}
