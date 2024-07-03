
public class firstRepeated {

    public static int firstRepeatedElement(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4};
        System.out.println(firstRepeatedElement(arr));

    }
    
}
