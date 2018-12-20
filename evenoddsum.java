public class evenoddsum {
    public static void main(String args[]) {
        int number = 2468642;
        evenodd(number);
    }
    public static void evenodd(int number){
        int value1 = 0;
        int value2 = 0;
        while (number > 0)
        {
            if ((number % 10) % 2 == 0)
                value1 = value1 + number % 10;
            else
                value2 = value2 + number % 10;
            number = number / 10;
        }
        System.out.print("Value1 : " + value1 + " Value2 : " + value2);
    }

}
