
public class pairSum {

    //Find the total number of pairs in the Array whose sum is equal to the given value X.

    public static int noOfPairSum(int arr[],int x){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};
        System.err.println(noOfPairSum(arr, 7));
    }
    
}
