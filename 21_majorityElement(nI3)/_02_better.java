import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class _02_better {

    public static ArrayList<Integer> majorityElement(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        int min=(int)(n/3)+1;
        for(int i=0;i<n;i++)
        {
            int value=map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);

            if(map.get(arr[i])==min){
                list.add(arr[i]);
            }
            if(list.size()==2){
                break;
            }
        }
        return list;    

        //Time complexity = O(nlogn)
        // Space Complexity = O(n)
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,2,2,2};
        ArrayList<Integer> list=majorityElement(arr);
        System.out.println(list);
    }
    
}
