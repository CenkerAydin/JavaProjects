import java.util.Scanner;

public class GDC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second integer: ");
        int n2=sc.nextInt();

        System.out.println("The greates common divisor (gdc) between "+n1+" and "+n2+ " is "+gdc(n1,n2));
    }

    public static int gdc(int n1,int n2){
        int gdc=1;
        int k=2;

        while (k<=n1 && k<=n2){
            if (n1%k==0 && n2%k==0){
                 gdc=k;
            }
            k++;
        }
        return gdc;
    }
}
