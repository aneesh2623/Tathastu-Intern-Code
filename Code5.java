import java.util.Scanner;
class PnC{
    public static int fact (int num){
    int fact=1, i=1;
    for(i=1; i<=num; i++)
    {
        fact = fact*i;
    }
    return fact;
    }
    public static void main(String[]args){
    int n,r;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter value of n:");
    n = input.nextInt();
    System.out.println("Enter value of r:");
    r =input.nextInt();
    System.out.println("NCR is " +(fact(n)/(fact(n-r)*fact(r))));
    System.out.println("NPR is:" + (fact(n)/(fact(n-r))));
    }
}
    
