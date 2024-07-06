import java.util.ArrayList;

public class _01_bruteForce {
    public static ArrayList<Integer> majorityElement(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                if(count>n/3 && !list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        
            return list;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,2,2,2};
        ArrayList<Integer> list=majorityElement(arr);
        System.out.println(list);
    }
    
}
