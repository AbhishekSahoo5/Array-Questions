import java.util.Arrays;

public class _03_optimized {

    public static String twoSum(int arr[], int target)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int left=0, right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "Yes";
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return "No";
    }
    /*
     * Time complexity = O(n*nlogn)
     * Space compleixty = O(1)
     */

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;

        System.out.println(twoSum(arr, target));

    }
    
}
