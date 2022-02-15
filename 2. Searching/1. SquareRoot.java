
import java.util.*;
 
class SquareRoot {
    static int countSquares(int x) {
        int sqr = (int) Math.sqrt(x);
        int result = (int) (sqr);
        return result;
    }
 
    public static void main(String[] args)
    {
        int x = 9;
        System.out.print(countSquares(x));
    }
}
