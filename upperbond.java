package assiment14feb;
import java.util.*;


public class upperbond {
	/*
	static int upper(int arr[],int Target) {
		int low=0;int high=arr.length-1;
		int result=-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==Target) {
				result= mid;
				
				low=mid+1;
			}
			else if(arr[mid]<Target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		return result;
		
	}*/
	/*public static void main(String[] args) {
		
		int arr[]= {1,2,2,2,2,3,4,5,6};
		int target=2;
		System.out.println(upper(arr,target));
		
		
		
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        int count=0;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==arr[i]) {
        		count++;
        	}
        }
        System.out.println(count);
		
	} */
	
/*	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int[] arr=new int[size];
	        int sumno=sc.nextInt();
	        
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	            
	        }
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr.length;j++){
	                
	                if(arr[i]+arr[j]==sumno){
	                    System.out.println(arr[j]+" "+arr[i]);
	                    break;
	                }
	            }
	            break;
	        }
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
	    }

	

}*/
	
	Scanner scan;
    LinkedList<String> list;
    
    int n;
    
    void getVal() {
        
        scan = new Scanner(System.in);
        list = new LinkedList<String>();
        
        
        n = scan.nextInt();
        
 
        for(int i=0; i<n; i++) {
            
            list.add(scan.next());
        }
    }
    
    void display() {
        
 
        for(int i=0; i<list.size(); i++) {
            
            System.out.println(list.get(i));
        }
    }
    
    void AddFirst() {
        
        String item = scan.next();
        
        list.addFirst(item);
        
        display();
    }
    
   
}
 
class MainClass {
    
    public static void main(String args[]) {
        
        Solution obj = new Solution();
        
        obj.getVal();
        obj.display();
        
        obj.AddFirst();
 
    }
}
