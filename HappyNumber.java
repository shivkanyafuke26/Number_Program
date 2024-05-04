/*
class HappyNumber  
{     
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
        int num = 82;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
        }  
          
        //Happy number always ends with 1  
        if(result == 1)  
            System.out.println(num + " is a happy number");  
        //Unhappy number ends in a cycle of repeating numbers which contains 4  
        else if(result == 4)  
            System.out.println(num + " is not a happy number");     
    }  
}  

*/

class HappyNumber{
       static int num=82;
       static int sum=0;
       static int sum1=sum;

    public static void main(String[] args) {

        happyNumber();

        if(sum1==1){
            System.out.println("yes happy no.");
        }
        else{
            System.out.println("no not");
            happyNumber();
        }

    }
    public static void happyNumber() {
        while(num>0){
            int rem=num%10;
            int sqr=rem*rem;
            sum+=sqr;
            num/=10;
        }
        
        System.out.println("sum is : "+sum);

        while(sum>0){
            int rem1=sum%10;
            sum1+=rem1;
            sum/=10;
        }
        System.out.println("sum1 is : "+sum1);

    }

}