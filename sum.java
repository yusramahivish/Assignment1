import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of elements: ");
        int n=sc.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter The Number "+i+": ");
            a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println("The sum of given numbers is : "+sum);
        System.out.println("The Average of given numbers is : "+sum/n);
    }
}
