
public class squareSort {

    //Given an integer array "arr" sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

    public static void sortSquare(int arr[])
    {
        int n=arr.length;
        int left=0, right=n-1;
        int [] ans=new int[n];
        int k=0;

        while (left<=right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        sortSquare(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
