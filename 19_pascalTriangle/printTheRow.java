import java.util.ArrayList;

public class printTheRow {
    //Print the nth row of pascal Triangle

    public static ArrayList<Integer> printNthRow(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);

        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> list=printNthRow(n);
        System.out.println(list);
    }
    
}
