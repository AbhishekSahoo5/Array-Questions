
public class greaterThanX {

    public static int countGreater(int arr[], int x){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        System.out.println(countGreater(arr, 3));
    }    
}
