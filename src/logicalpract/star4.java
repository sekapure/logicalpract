package logicalpract;

public class star4 
{
public static void main(String[] args)
{
//  *
// **
//***
	
	int star=1;
	int space=2;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=space;j++)
			
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		space--;
		star++;
		System.out.println();
	}
	
}
}
