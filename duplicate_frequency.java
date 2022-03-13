package feb23;

public class duplicate_frequency {
	
	static int frequency_count(int[] arr,int target,boolean flag) {
		int low=0,high=arr.length-1;
		int result=-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target) {
				result = mid;
				if(flag==true) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
				
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return result;		
		
	}

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,2,3,3,4,4,5,5,5,5,6,6,6,7,7,8,9};
		int target=5;
		
		int lower_inx=frequency_count(arr,target,false);
		int upper_inx=frequency_count(arr,target,true);
		
		System.out.println(upper_inx-lower_inx+1);
		
	}

}
