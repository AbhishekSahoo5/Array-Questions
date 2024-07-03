
public class swapUsingSumAndDiff {

    // Given 2 integers a and b. Swap the 2 given values using sum and difference method.

    public static void swap(int a,int b)
    {
        System.out.println("Before Swapping");
        System.out.println(a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping");
        System.out.println(a+" "+b);
    }


    public static void main(String[] args) {
        int a=10;
        int b=12;

        swap(a, b);
    }
    
}
