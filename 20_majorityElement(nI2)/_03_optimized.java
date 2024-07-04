public class _03_optimized {

    public static int majorityElement(int arr[])
    {
        int n=arr.length;
        int element=0;
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(count==0){
                count=1;
                element=arr[i];
            }
            else if(element==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int coun=0;
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i]){
                coun++;
            }
        }
        if(coun>n/2){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElement(arr));
        
    }
    
}
