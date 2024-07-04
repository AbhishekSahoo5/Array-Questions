
public class rotateByK {
    // Rotate the given arrau "a" by k steps, where k is non-negative.  Notes: k can be greater than n as well.

    public static void kRotate(int arr[], int k){
        int n=arr.length;
        k=k%n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);


    }

    public static void reverse(int arr[],int start,int end)
    {
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=1;

        kRotate(arr, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
