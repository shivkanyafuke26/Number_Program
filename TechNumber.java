class TechNumber{
	public static void main(String[] args) {
		int num=2025;
		int dup=num;
		int length=0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		System.out.println(length);

		if(length%2==0){


		int div=1;

		for(int i=1;i<=length/2;i++){
			div=div*10;
		}

		int firstHalf=dup/div;

		int lastHalf=dup%div;

		int sum=firstHalf+lastHalf;

		int sqr=sum*sum;

		
			System.out.println(dup==sqr?dup+" It is a Tech NUmber":dup+" not tech number");
		}
		else{
			System.out.println("Not Tech NUmber");
		}


	}
}


//i was little bit nervous this was my first interview
//


















/*

import java.io.*; 
import java.util.*; 
  
class DuckNumber { 
    // Function to check whether given number num is a 
    // Duck Number or not 
    public static boolean checkForDuckNumber(String num) 
    { 
        // len stores total number of digits in num 
        int len = num.length(); 
        int zeros = 0; 
        
        // below loop counts number of zeros in num 
        for (int i = 0; i < len; i++)  
        { 
            char digit = num.charAt(i); 
            if (digit == '0') 
                zeros++; 
        } 
        
        // get the first digit of num 
        char startDigit = num.charAt(0); 
        
        // if first digit is non-zero and atleast one zero 
        // is encountered, then num is Duck Number 
        if (startDigit != '0' && zeros > 0) 
            return true; 
        
        // if above condition is not satisifed, then num 
        // is NOT a Duck Number 
        return false; 
    } 
    public static void main(String[] args) 
    { 
        String num1 = "1274"; 
        boolean isDuckNumber1 = checkForDuckNumber(num1); 
        
        if (isDuckNumber1) { 
            System.out.println("Given number " + num1 
                               + " is a Duck Number"); 
        } 
        else 
        { 
            System.out.println("Given number " + num1 
                               + " is not a Duck Number"); 
        } 
        
        
        String num2 = "11005"; 
        boolean isDuckNumber2 = checkForDuckNumber(num2); 
        
        if (isDuckNumber2) { 
            System.out.println("Given number " + num2 
                               + " is a Duck Number"); 
        } 
        else 
        { 
            System.out.println("Given number " + num2 
                               + " is not a Duck Number"); 
        } 
    } 
}




*/