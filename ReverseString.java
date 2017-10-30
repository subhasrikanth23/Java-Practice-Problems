import java.io.*;
import java.util.*;

public class ReverseString
{
    public static String standardReverse(String s)
    {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse += s.charAt(i);
        }
        return reverse;
    }
    public static String inPlaceReverse(String s)
    {
        char[] string = s.toCharArray();
        for(int i = 0, j = string.length - 1; i < string.length/2; i++, j--)
        {
            char c = string[i];
            string[i] = string[j];
            string[j] = c;
        }
        System.out.println("Using StringBuilder: ");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder = stringBuilder.reverse();
        System.out.println("\t" + stringBuilder.toString());
        System.out.println("Using char manipulation: ");
        System.out.print("\t");
        return String.valueOf(string);
    }
    public static void main(String[] args)
    {
        if (args.length == 2)
        {
            String method = args[0];
            String input = args[1];
            System.out.println("Reversing string using " + method + " method");
            if (method.equals("standard"))
            {
                System.out.println("\t" + standardReverse(input));
            }
            else if (method.equals("inplace"))
            {
                System.out.println(inPlaceReverse(input));
            }
            else
            {
                System.out.println("Invalid method.");
                return;
            }
        }
        else if (args.length >= 3)
        {
            System.out.println("Too many arguments.");
            return;
        }
        else if (args.length == 1)
        {
            System.out.println("No string to reverse.");
            return;
        }
    }

}