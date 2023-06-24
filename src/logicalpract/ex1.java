package logicalpract;

public class ex1
{
public static void main(String[] args)
{
	int no=153;
	int sum=0;
	
	int temp;
	temp=no;
	
	for(int i=no;i>0;i=i/10)//153 153>0 153%10=3 0+3*3*3=27 153/10=15
	{
		int rem =i%10;//15 15>0  15%10=5  27+5*5*5=152 15/10=1
		
		sum=sum+rem*rem*rem;//1  1>0 1%10=1  152+1*1*1=153  1/10=0
	}

	if(sum==temp)
	{
		System.out.println(":given no is armstrong");
		
	}	
	else
	{
		System.out.println(":not armstrong");
	}
		
}
}

