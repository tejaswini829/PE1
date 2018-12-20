import java. util. Scanner;
public class sorting {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        sort(n,a);
    }
    public static void sort(int n,int a[]){
        int sum=0;
        int temp;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);

        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                sum+=a[i];
            }
        }
        System.out.println("sum =" +sum);
        if(sum>15){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }

}
