import java. util. Scanner;
public class unspecifiednumsum {
    public static void main(String[] args) {

        int number;
        Scanner s = new Scanner(System.in);


        System.out.print("Enter no. of elements you want in array:");
        number = s.nextInt();
        int a[] = new int[number];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < number; i++) {
            a[i] = s.nextInt();
        }
        unspc(number, a);
    }
    public static void unspc(int number,int a[]){
int sum=0;
        for(int i=0;i<number;i++){
            sum+=a[i];
        }
        System.out.println("The sum of numbers is" +sum);



    }


}
