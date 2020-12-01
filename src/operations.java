import java.util.Scanner;

public class operations {
    Scanner input = new Scanner(System.in);

    public int getNumber(){
        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt();

        return userNumber;
    }

    static boolean findTrueFalse(int num){
        if (num >= 0){
            boolean trueFalse = true;
            return trueFalse;
        }
        else{
            boolean trueFalse = false;
            return trueFalse;
        }
    }

    static int findAbsolute(int num){
        if (num <= 0){
            int absoluteNum = Math.abs(num);
            return absoluteNum;
        }
        else{
            return num;
        }
    }

    static boolean findEven(int num){
        if (num > 0 && num % 2 == 0){
            boolean trueFalse2 = true;
            return trueFalse2;
        }
        else{
            boolean trueFalse2 = false;
            return trueFalse2;
        }
    }

    public void display(){
        int num = getNumber();
        System.out.println("is the number " + num + " positive? " + findTrueFalse(num));
        System.out.println("the absolute value of the number " + num + " is: " + findAbsolute(num));
        System.out.println("the number " + num + " is even: " + findEven(num));
    }
}
