
public class repeatchar {
    public static void main(String args[]) {
        int input2 = 5;
        String input1 = "stackroute";
        System.out.print("stackroute");
        repeat(input1, input2);
    }
   public static void repeat(String input1, int input2)
    {
        for(int i=1;i<=input2;i++) {
            System.out.print(input1.substring(input1.length()-input2));
        }



    }
}
