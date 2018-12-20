import java. util. Scanner;
public class iteration {
    public static void main(String args[]) {
int number;
        System.out.println("Enter an integer for which the sequence need to be generated");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        iter(number);
    }
    public static void iter(int num){
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j =i; j > 0; j--) {
                System.out.println(+ i);
            }
        }
    }

}
