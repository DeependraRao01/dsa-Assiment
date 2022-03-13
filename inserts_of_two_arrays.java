package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class inserts_of_two_arrays {
	  public int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        for (int i : nums1) {
	            set.add(i);
	        }

	        List<Integer> result = new ArrayList<>();

	        for (int i : nums2) {
	            if(set.contains(i)){
	                result.add(i);
	                set.remove(i);
	            }
	        }

	        int[] ints = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            ints[i]=result.get(i);
	        }
	        return ints;
	    }
	

}
