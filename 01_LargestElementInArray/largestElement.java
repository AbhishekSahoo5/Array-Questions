
public class largestElement {

    public static int largest(int arr[]){
        int lar=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,4,5,67,91,112};
        System.out.println(largest(arr));
    }
}
