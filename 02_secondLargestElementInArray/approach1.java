
public class approach1 {

    public static int secondLargest(int arr[])
    {
        int n=arr.length;
        if(n==0 || n==1){
            return -1;
        }
        int large=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            large=Math.max(large,arr[i]);
        }

        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>second_large && arr[i]!=large)
            {
                second_large=arr[i];
            }
        }
        return second_large;

        // Time Complexity =O(2n)
        // Space Complexity = O(1)

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        System.out.println(secondLargest(arr));
    }
    
}
