/* Given two strings as input, find out if they are isomorphic
(Isomorphic strings: if each string can be derived from the other by a set of character replacements.
E.g. 'add' and bee' are isomorphic whereas 'day' and 'bee' are not). */

import java.util.*;

public class Isomorph
{
    public static boolean areIsomorphic(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;
        else if ((s1.length() < 1 || s2.length() < 1))
            return false;
        HashMap <Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s1.length(); i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
 
            if (map.containsKey(c1))
            {
                if (map.get(c1)!= c2)
                    return false;
            }
            else
            {
                if(map.containsValue(c2))
                    return false;
                map.put(c1, c2);
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        if (args.length > 1 && args.length < 3)
        {
            System.out.println(areIsomorphic(args[0],args[1]));
        }
    }
}