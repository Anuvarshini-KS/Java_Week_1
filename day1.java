class day1
{
    public static void main(String[]args)
    {
        hashCode();
        byteOverflow();
    }
    public static void hashCode()
    {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("S1 HashCode : "+System.identityHashCode(s1));
        System.out.println("S2 HashCode : "+System.identityHashCode(s2));
        System.out.println("S3 HashCode : "+System.identityHashCode(s3));
    }
    public static void byteOverflow()
    {
        byte b = 125;
        for(int i=0;i<10;i++)
        {
            System.out.println(b++);

        }
    }
}
