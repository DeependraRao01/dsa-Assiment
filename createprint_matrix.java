package martix2d;
import java.util.*;

public class createprint_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int r=sc.nextInt();
		int[][] arr=new int[c][r];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
