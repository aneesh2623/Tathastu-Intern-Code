import java.util.Scanner;
class Calculato{
    public static void main (String[] args){
        int number;
        double Num1 ,Num2 , Result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1:");
        Num1 = input.nextDouble();
        System.out.println("Enter Num2:");
        Num2 = input.nextDouble();
        System.out.println("Choose the number between 1 to 4:");
        number = input.nextInt();
        if(number <=0 || number >5)
        {
            System.out.println("Invalid choice");
        }
        else
        {
            
            switch(number)
            {
                    case 1 :
                    {
                        Result= Num1 + Num2;
                        System.out.println(Num1 +  " + "  + Num2 + "=" + Result );
                        break;
                    }
                    case 2:
                    {
                        Result = Num1 - Num2;
                        System.out.println(Num1 + " - " + Num2 + " = " + Result);
                        break;
                    }
                    case 3 :
                    {
                        Result = Num1 * Num2;
                        System.out.println(Num1 + " * " + Num2 + " = "  + Result);
                        break;
                    }
                    case 4:
                    {
                        Result = Num1 / Num2;
                        System.out.println(Num1 + " / " + Num2 + " = " +Result);
                        break;
                    }
            }
        }
    }
}

        
        
    

            
            
        
    


               
        

        
        
    

