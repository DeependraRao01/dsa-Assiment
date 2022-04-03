package recursion3;

public class product_recur {
    
   static int prod(int x, int y)
   {
       if (x < y)
           return prod(y, x);
    
       else if (y != 0)
           return (x + prod(x, y - 1));
    
       else
           return 0;
   }
   public static void main (String[] args)
   {
       int x = 2, y = 5;
       System.out.println(prod(x, y));
   }
}