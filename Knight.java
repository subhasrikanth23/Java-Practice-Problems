import java.io.*;

public class Knight
{
    public static class Coordinate
    {
        int x;
        int y;
        boolean validCoordinate;
        public Coordinate()
        {
            x = -1;
            y = -1;
            validCoordinate = false;
        }
        public Coordinate(int x, int y)
        {
            this.x = x;
            this.y = y;
            validCoordinate = isValid();
        }
        public boolean isValid()
        {
            if (x < 1)
               return false;
            else if (y < 1)
               return false;
            else if (x > 8)
               return false;
            else if (y > 8)
               return false;
            return true;
        }
        public String printCoordinate()
        {
            return "(" + x + ", " + y + ")";
        }
        public int getX()
        {
            return x;
        }
        public int getY()
        {
            return y;
        }
        public boolean valid()
        {
            return validCoordinate;
        }
        public Coordinate right()
        {
            return new Coordinate(x, y + 1);
        }
        public Coordinate left()
        {
            return new Coordinate(x, y - 1);
        }
        public Coordinate up()
        {
            return new Coordinate(x - 1, y);
        }
        public Coordinate down()
        {
            return new Coordinate(x + 1, y);
        }
        public Coordinate[] knightMoves()
        {
            Coordinate[] newCoordinates = new Coordinate[8];
            newCoordinates[0] = this.up().right().right();
            newCoordinates[1] = this.up().up().right();
            newCoordinates[2] = this.up().up().left();
            newCoordinates[3] = this.up().left().left();
            newCoordinates[4] = this.down().left().left();
            newCoordinates[5] = this.down().down().left();
            newCoordinates[6] = this.down().down().right();
            newCoordinates[7] = this.down().right().right();
            return newCoordinates;
        }
    }
    public static String calculateKnightPositions(Coordinate knightPosition)
    {
        if (knightPosition.valid() == false)
        {
            System.out.println("Invalid position; please enter coordinates between 1 and 8");
        }
        else
        {
            String results = "";
            Coordinate[] knightMoves = knightPosition.knightMoves();
            for (int i = 0; i < knightMoves.length; i++)
            {
                if (knightMoves[i].valid() == false)
                    continue;
                if (results.length() == 0)
                {
                    results = results + knightMoves[i].printCoordinate();
                    continue;
                }
                results = results + "; " + knightMoves[i].printCoordinate();
            }
            return results;
        }
        return null;
    }
    public static void main(String[] args)
    {
        if (args.length > 1 && args.length < 3)
        {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            Coordinate position = new Coordinate(x, y);
            String results = calculateKnightPositions(position);
            System.out.println(results);
        }
    }
}