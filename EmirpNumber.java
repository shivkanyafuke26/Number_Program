import java.util.Scanner;
public class EmirpNumber{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		boolean flag=count==0?true:false;

		if(flag)
		{
			int rev=0;
			while(num>0)
			{
				int rem = num%10;
				rev=rev*10+rem;
				num/=10;
			}	
			int count1=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count1++;
				break;
			}
		}
		boolean flag1=count1==0?true:false;

		if(flag && flag1)
		   {
			System.out.println("Emirp number");
		   }
		else
		   {
			System.out.println("not Emirp number");
		   }
		}	
		else
		    {
			System.out.println("not Emirp number");
	     	}	
	}
}