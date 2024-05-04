import java.util.Scanner;
class PerfectSquareRoot{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");   //9
		int num=sc.nextInt();
		int sqrrt=0;
		boolean flag=false;

		for(int i=1;i<=num/2;i++){      //num/2=  9/2=4.5
			System.out.println("num"+num);                //9    //9  //9
			System.out.println("ini"+i);                  //1   //2   //3

			if(i*i==num){
				System.out.println("ne"+i);             //3

			flag=true;

			sqrrt=i;
			System.out.println("sqr"+sqrrt);           //3

			break;
				}
			}
		if(flag){
			System.out.println(sqrrt+" is a perfect SquareRoot of " +num);
		}
		else{
			System.out.println(num+ " it is not a perfect squareRoot");
		}
	}
}

