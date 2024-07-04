
public class checkNumberIsPresent {
    //Given Q queries, check if the given number is present in the array or not.
    // Note: value of all the elements in the array is less than 10 to the power 5.

    public static String[] checkQueriesPresent(int arr[],int q[])
    {
        int freq[]=new int[100005];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        String res[]=new String[q.length];
        for(int i=0;i<res.length;i++)
        {
            if(freq[q[i]]>=1){
                res[i]="Yes";
            }
            else{
                res[i]="No";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5,6,5,400,560,10000,400};
        int q[]={5,34,400,10000,560};

        String res[]=checkQueriesPresent(arr, q);

        for(int i=0;i<q.length;i++)
        {
            System.out.print(q[i]+" ");
        }
        System.out.println();

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }


        


    }
    
}
