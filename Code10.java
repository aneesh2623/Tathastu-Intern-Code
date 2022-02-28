import java.util.*;
class TransposeMatrix{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int row,column;
        System.out.println("Enter the number of row");
        row = input.nextInt();
        System.out.println("Enter number of column");
        column= input.nextInt();
        int arr[][] = new int[9][9];
        System.out.println("Enter element of matrix:");
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<column;j++)
            {
                arr[i][j] = input.nextInt();
                
        }
        }
        System.out.println("The elements in original matrix are:");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println(arr[i][j]+"");
            }
            
            
        
        System.out.println("");
        }
        System.out.println("after transposing the elements are:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+"");
            }
            System.out.println("");
        }
            
    
    }
}
       
    
    
        
        
                
                
    


