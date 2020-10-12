class Task4
{
    public static void main(String[]args)    
    {
        int n=12,buf=0;
        double  e=2.71,M=0;
        for(int x=1;x<=n;x++)
        {
            System.out.println("a["+x+"]= "+(1/(Math.pow((x-1),2))));
            M=Math.abs(1/(Math.pow((x-1),2)));
            if(M<e)
            {
                e=M;
                buf=x;
            }
        }
        System.out.println(M+" - самое маленькое значение с номером "+buf);
    }
}

