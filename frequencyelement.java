package assiment14feb;
import java.util.*;

class frequency{
	
	int[] arr=new int[10];
	int key;
	
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value: ");
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter you find frequency key : ");
		key=sc.nextInt();
		
	}
	void countdata() {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	
	
}

public class frequencyelement {
	public static void main(String[] args) {

		frequency abc=new frequency();
		abc.getdata();
		abc.countdata();
		
	}	
	
}
