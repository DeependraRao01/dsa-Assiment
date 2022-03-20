package recursion2;

public class average_element {
	 static double average(int a[], int n)
	    {
	         
	        int sum = 0;
	         
	        for (int i = 0; i < n; i++)
	            sum += a[i];
	     
	        return (double)sum / n;
	    }
	     
	    public static void main (String[] args)
	    {
	         
	        int arr[] = {12, 1, 3, 4, 6, 2, 7, 8, 9};
	        
	        int n = arr.length;
	     
	        System.out.println(average(arr, n));
	    }

}
