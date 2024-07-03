
public class swappingTwoValues {

    //Given 2 integers a and b. Swap the 2 given values using temporary variables.

    public static void swap(int a, int b)
    {
        System.out.println("Original Values before swap");
        System.out.println(a+" "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("Original values after swap");
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;

        swap(a, b);
    }
    
}
