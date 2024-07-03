
public class approach1 {

    public static boolean checkSortedRotated(int arr[])
    {
        int n=arr.length;
        int count=0;

        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[0]<arr[n-1]){
            count++;
        }
        
        return count<=1;
        
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,10,1,2};
        System.out.println(checkSortedRotated(arr));
    }
    
}
