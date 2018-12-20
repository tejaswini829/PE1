import java. util. Scanner;
public class vowelconsonant {
    public static void main(String[ ] arg) {
        String string1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        string1 = sc.nextLine();
        chk(string1);
    }
    public static void chk(String string1){
        int i;
        char c;
        for(i=0;i<string1.length();i++){
            c=string1.charAt(i);
            if(string1.charAt(i) >= 65 && string1.charAt(i) <= 123) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println(string1.charAt(i));
                    System.out.println("Vowel");

                } else {
                    System.out.println(string1.charAt(i));
                    System.out.println("Consonant");
                }
            }
            else{
                System.out.println("The character  in the string is not a letter");
            }

        }

    }

}
