import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;

        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++) {
            int num = input.nextInt();

            if(num > max)
                max = num;
        }
        System.out.println("The largest number is: " + max);
    }
}