
public class uniqueElement {
    // Find the unique number in a given array where all the elemnts are being repeated twice with one value being unique (Only positive elements in array).

    public static int uniqueElementinArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>-1)
            {
                ans=arr[i];
            }
        }
        return ans;
    }



    public static void main(String[] args) {

        int arr[]={1,2,3,4,2,1,3};
        System.out.println(uniqueElementinArray(arr));
        
    }
}
