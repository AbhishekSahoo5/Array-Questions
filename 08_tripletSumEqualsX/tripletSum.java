
public class tripletSum {
    
    public static int tripletSumEqualsX(int arr[],int x)
    {
        int ans=0;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        System.out.println(tripletSumEqualsX(arr, 12));
    }
    
}
