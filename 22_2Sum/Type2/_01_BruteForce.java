
public class _01_BruteForce {

    public static int[] twoSum(int arr[], int target)
    {
        int n=arr.length;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    /*
     * Time complexity = O(n2)
     * Space Complexity = O(1)
     */

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;

        int res[]=twoSum(arr, target);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    
}
