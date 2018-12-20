
import java. util. Scanner;
public class charcheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a character");
        char m = reader.findInLine(".").charAt(0);
         check ( m);

    }
   public static void  check (char m){



        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character.");
        }


    }
}
