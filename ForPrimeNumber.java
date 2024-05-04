/*
import java.util.Scanner;
class ForPrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		System.out.println(flag?"prime":"Not Prime");
	}
	
}
*/

/*
import java.util.Scanner;
public class ForPrimeNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
*/


import java.util.Scanner;
class ForPrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
			count++;
			break;
			}
			}
		if(count==0){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
		}

	}
