import java.io.*;

public class Door
{
    public static int numFactors(int doorNum, int turnNum)
    {
        int count = 0;
        if (turnNum <= (doorNum/2))
        {
            for (int i = 2; i < turnNum; i++)
            {
                if ((doorNum % i) == 0)
                {
                    count++;
                }
            }
        }
        for (int i = 2; i < (doorNum/2); i++)
        {
            if ((doorNum % i) == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static String doorStatus(int numFactors)
    {
        if ((numFactors % 2) == 0)
        {
            return "The door is closed.";
        }
        return "The door is open.";
    }
    public static void main(String[] args)
    {
        if (args.length > 1 && args.length < 3)
        {
            int doorNum = Integer.parseInt(args[0]);
            int turnNum = Integer.parseInt(args[1]);
            System.out.println(doorStatus(numFactors(doorNum, turnNum)));
        }
    }
}