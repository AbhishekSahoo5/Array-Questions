import java.util.HashMap;
import java.util.Map;

public class _02_better {

    public static int majorityElement(int arr[])
    {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            // key--> arr[i]
            // value--> frequency

            int value=map.getOrDefault(arr[i], 0);
            map.put(arr[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={3,2,3};
        System.out.println(majorityElement(arr));
    }
    
}
