package feb23;

public class findz {
	static boolean findchar(String[] arr,String target) {
		
		int low=0,high=arr.length-1;
		
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target) {
				System.out.println(mid);
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"a","b","c","e","p","q","t","z"};
		String target="z";
		
		System.out.println(findchar(arr,target));

	}

}
