import java.util.ArrayList;

public class _03_optimal {

    public static ArrayList<Integer> majorityElement(int arr[])
    {
        int n=arr.length;
        int ele1=0, ele2=0;
        int count1=0,count2=0;

        for(int i=0;i<n;i++)
        {
            if(count1==0 && ele2!=arr[i]){
                count1=1;
                ele1=arr[i];
            }
            else if(count2==0 && ele1!=arr[i]){
                count2=1;
                ele2=arr[i];
            }
            else if(ele1==arr[i]){
                count1++;
            }
            else if(ele2==arr[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        int coun1=0,coun2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ele1==arr[i]){
                coun1++;
            }
            if(ele2==arr[i]){
                coun2++;
            }
        }

        int min=(int)(n/3)+1;
        if(coun1>=min){
            list.add(ele1);
        }
        if(coun2>=min){
            list.add(ele2);
        }
        return list;

        // Time compleixty = O(n)
        // Time compleixty = O(1)
    }
    


    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,2,2,2};
        ArrayList<Integer> list=majorityElement(arr);
        System.out.println(list);
    }
    
}
