package recursion;
import java.util.*;

public class factorial {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num = sc.nextInt();
        long factorial = multiplyNo(num);
        System.out.println(factorial);
    }
    public static long multiplyNo(int num)
    {
        if (num >= 1)
            return num * multiplyNo(num - 1);
        else
            return 1;
    }
}