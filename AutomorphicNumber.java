class AutomorphicNumber{
	public static void main(String[] args) {
		 //int num=76 sqr(76)=5776 last digit=num

		int num=76;
		int dup=num;
		int sqr=num*num;
		System.out.println(sqr);
		int div=1;
		
		while(num>0){

			div*=10;
			num/=10;

		}
		System.out.println(div);
		System.out.println(num);
		int ld=sqr%div;
		System.out.println(ld);
		System.out.println((dup==ld)?dup+" Automorphic":dup+" not automorphic");

		}
	
}