class conditional{
    public static void main(String a[])
    {
        // this program prints the maximum of three integers
        int x = 9;
        int y = 6;
        int z = 11;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}