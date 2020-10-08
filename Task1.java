class Task1
{
	public static void main(String[]args)
	{
		int y=0;
		for(int x=0;((x>=0)&&(x<=40));x++)
		{
			y=(int)Math.pow(x,2)+x+41;
			if ((y%2!=0)&&(y%3!=0)&&(y%5!=0))
			{
			System.out.println(y+" простое число");
			}
			else
			{
				System.out.println(y+" непростое число");
			}
		}
	}	
}