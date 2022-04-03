package recursion4;

public class kthGrammar {
	public static int kthGrammar(int n, int k) {
        //base condition
        if(n == 1 || k == 1) {
            return 0;
        }
        //finding the length of the grammar
        int length = (int)Math.pow(2, n-1);
        int mid = length / 2;
        
        //recursive call
        if(k <= mid) {
            return kthGrammar(n-1, k);
        } else {
            return 1 - kthGrammar(n-1, k - mid);
        }
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthGrammar(10,4);

	}

}
