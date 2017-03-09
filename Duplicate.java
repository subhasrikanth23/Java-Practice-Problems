/* How do you find duplicates in an array (of integers) if there is more than one duplicate? */

import java.util.*;

public class Duplicate
{
    public static void duplicates(int[] input)
    {
        Set<Integer> uniqueInts = new HashSet<Integer>();
        for(int i = 0; i < input.length; i++) 
        {
            if(uniqueInts.add(input[i]) == false) /* only occurs if i already exists in uniqueInts */
            {
                System.out.println("Duplicate element found: " + input[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++)
        {
            input[i] = (Integer.parseInt(args[i]));
        }
        duplicates(input);
    }
}