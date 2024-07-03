
public class reverseArray {
    public static int[] reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int res[]=reverse(arr);


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    
}
