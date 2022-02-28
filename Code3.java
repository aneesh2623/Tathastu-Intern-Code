import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num to find factorial");
        num = input.nextInt();
        int i=1, fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
          System.out.println("Factorial of num  "   + num  +" is "+ fact);
        
    }
}

