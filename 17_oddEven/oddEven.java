
public class oddEven {

    // Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.

    public static int[] oddEvenSort(int arr[])
    {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            if(arr[start]%2!=0 && arr[end]%2==0)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[start]%2==0)
            {
                start++;
            }
            else if(arr[end]%2!=0)
            {
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int res[]=oddEvenSort(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    
}
