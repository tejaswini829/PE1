import java. util. Scanner;
public class targetnum {
    public static void main(String args[]) {
        int target = 60;
        int number;
        while (true) {
            System.out.println("Enter the number ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

            targetck(target,number);
        }
    }
    public static void targetck(int target,int number){

            if(number==target) {
                System.out.println("Number guessed matches the original number");

            }
            else if(number>target)
                System.out.println("Number guessed is greater than original number");
            else if(number<target)
                System.out.println("Number guessed is lesser than original number");

        }

    }
