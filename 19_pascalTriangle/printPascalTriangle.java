import java.util.ArrayList;

public class printPascalTriangle {
    //Print the entire Pascal Triangle
    public static ArrayList<ArrayList<Integer>> pascalTriangle(int n)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            row=nthRow(i);
            list.add(row);
        }
        return list;

        
    } 
    public static ArrayList<Integer> nthRow(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<n;i++)
        {
            ans*=(n-i);
            ans/=i;
            list.add(ans);
        }
        return list;
        
    }
    public static void main(String[] args) {
        int n=6;
        ArrayList<ArrayList<Integer>> list=pascalTriangle(n);
        System.out.println(list);
    }
    
}
