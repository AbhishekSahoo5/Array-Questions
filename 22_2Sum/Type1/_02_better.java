import java.util.HashMap;

public class _02_better {

    public static String twoSum(int arr[], int target)
    {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            int more=target-a;
            if(map.containsKey(more)){
                return "Yes";
            }
            map.put(arr[i], i);
        }
        return "No";
    }
    /*
     * Time complexity = O(n)
     * Space Complexity = O(n)
     */

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;

        System.out.println(twoSum(arr, target));

    }
    
}
