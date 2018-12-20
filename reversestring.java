import java.util.Scanner;
public class reversestring {
    public static void main(String args[]) {
        String string1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        string1 = sc.nextLine();
        reverse(string1);
    }
    private  static void reverse(String string1){

        String string2="";

        for (int i=string1.length()-1; i>=0; i--) {
            string2 += string1.charAt(i);
        }

        System.out.println(string2);


    }
}
