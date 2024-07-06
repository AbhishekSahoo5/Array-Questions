import java.util.HashMap;

public class _02_better {

    public static int[] twoSum(int arr[], int target)
    {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            int more=target-a;
            if(map.containsKey(more)){
                ans[0]=map.get(more);
                ans[1]=i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
    /*
     * Time complexity = O(n)
     * Space Complexity = O(n)
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
