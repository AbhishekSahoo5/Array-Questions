
public class returnElement {
    //Give row(r) and column(c), return the element at the place

    public static int pascalElement(int row,int col)
    {
         return ncr(row-1,col-1);
    }

    public static int ncr(int n, int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int row=5;
        int col=3;
        System.out.println(pascalElement(row, col));
    }
    
}
