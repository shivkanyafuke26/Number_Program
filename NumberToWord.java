import java.util.*;
class NumberToWord{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();
		String word="";
		while(num>0){
			int rem=num%10;
			switch(rem){
			case 0:word=" Zero" +word; break;
			case 1:word=" one" +word; break;
			case 2:word=" Two" +word; break;
			case 3:word=" Three" +word; break;
			case 4:word=" Four" +word; break;
			case 5:word=" Five" +word; break;
			case 6:word=" Six" +word; break;
			case 7:word=" Seven" +word; break;
			case 8:word=" Eight" +word; break;
			case 9:word=" Nine" +word; break;
			}
			num/=10;
		}
		System.out.println(word);
	}
	
}ijb 