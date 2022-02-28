import java.util.Scanner;
class ReverseString{
    public static void main(String[]args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be reversed:");
        str = input.nextLine();
        String rev = reverseString(str);
        System.out.println("The reversed string is: " + rev);
    }
    public static String reverseString(String str)
    {
        
        if (str.isEmpty())
            return str;
        
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
