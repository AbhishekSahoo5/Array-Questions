
public class sort01 {

    //Sort an Array consiting of only 0s and 1s.
    //Using two pointer approach

    public static void sort10P(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]==0){
                start++;
            }
            else if(arr[start]==1 && arr[end]==0)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[end]==1){
                end--;
            }
        }
    }


    public static void main(String [] args) {
        int arr[]={1,0,0,1,0,1,1,0,0};
        sort10P(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
