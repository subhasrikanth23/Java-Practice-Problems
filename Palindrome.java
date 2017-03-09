import java.io.*;

public class Palindrome
{
    public static boolean isPalindrome(int original)
    {
        int n = original;
        int reverse = 0;
        int digit = 0;
        while (n > 0)
        {
            digit = n % 10;
            reverse = reverse*10 + digit;
            n = (n - digit) / 10;
        }
        if (reverse == original)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        if (args.length >= 1)
        {
            int input = Integer.parseInt(args[0]);
            System.out.println(isPalindrome(input));
        }
    }
}