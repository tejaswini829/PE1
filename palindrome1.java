public class palindrome1 {
    public static void main(String[] args) {

        int num =123454321, reversedInteger = 0, remainder, originalInteger;
        int value1 = 0;
        int value2 = 0;

        originalInteger = num;


        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
            while (originalInteger > 0)
            {
                if ((originalInteger % 10) % 2 == 0)
                    value1 = value1 + originalInteger % 10;
                else
                    value2 = value2 + originalInteger % 10;
                originalInteger = originalInteger / 10;
            }
            System.out.print("Value1 : " + value1 + " Value2 : " + value2);
        }
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }

}
