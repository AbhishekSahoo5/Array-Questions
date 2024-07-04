
public class _01_bruteForce {
    public static int majorityElement(int arr[])
    {
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
                if(count>n/2){
                    return arr[i];
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,3};
        System.out.println(majorityElement(arr));
    }
    
}
