import java. util. Scanner;
public class power {

     static int  powercheck(int num){
        if(num == 0)
            return 0;
        while(num != 1)
        {
            if(num % 4 != 0)
                return 0;
            num = num / 4;
        }
        return 1;


    }
    public static void main(String args[]) {
        int number;
     System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if(powercheck(number) == 1)
            System.out.println(number +
                    " is a power of 4");
        else
            System.out.println(number +
                    "is not a power of 4");

    }

}
