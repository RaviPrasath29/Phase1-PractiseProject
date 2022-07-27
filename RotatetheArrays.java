package AssistedProjects4;


class RotateArray { 
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class RotatetheArrays {
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 10,20,30,40,50,60,70}; 
        		r.rotate(arr, 6); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}


}
