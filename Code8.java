import java.util.Scanner;
class MirrorInverse {
    public static void main(String[] args)
    {
        int num;
        int count =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        num = input.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
            
        }
        System.out.println("Array elements are:");
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[arr[i]]==i)
            {
                count++;
            }
        }
        if  (count!=0)
        {
            System.out.println("The given array is mirror inverse");
        }
        else
        {
            System.out.println("Array is not mirror inverse");
        }
            
            
    }
}
       
        