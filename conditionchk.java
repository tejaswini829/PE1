import java. util. Scanner;
public class conditionchk {
    public static void main(String args[]) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        condition(x);
    }
    public static void condition(int x){

        if(x>20 && x<30)
        {

            if(x%2!=0)
                System.out.println("Tom");

            else
                System.out.println("Jerry");
        }

    }
}
