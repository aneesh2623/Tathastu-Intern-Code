import java.util.*;
class Palindrome{
    static boolean checkPalindrome(String str, int start, int end)
    {
        if (start==end)
            return true;
        if ((str.charAt(start)) != (str.charAt(end)))
                return false;
        if (start< end+1)
                return checkPalindrome(str, start+1, end-1);
        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n =str.length();
        if(n==0)
            return true;
        return checkPalindrome(str,0,n-1);
    }
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.nextLine();
        if(isPalindrome(str))
            System.out.println(str +"  is Palindrome");
        else
            System.out.println(str + " is not a Palindrome);"
                    }
}
                    
                  
                    
        
        
                
                
        
        
    }
            
}