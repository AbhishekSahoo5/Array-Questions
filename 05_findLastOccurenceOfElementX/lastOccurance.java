public class lastOccurance {

    public static int findLastOccurance(int arr[],int x)
    {
        int last=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                last=i;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={5,6,5,3,5,4};
        System.out.println(findLastOccurance(arr, 0));

    }
}