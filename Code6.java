import java.util.Scanner;
class DiamondPattern{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Enter rows of Diamond Pattern:");
        rows = input.nextInt();
        System.out.println("Printing Diamond Pattern");
        for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
        for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
        
    }
}