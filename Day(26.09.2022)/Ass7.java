//WAP to check a number is prime or not

class Ass7{
	public static void main(String args[]){
		int n=12;
		boolean flag=false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		if(!flag)
		System.out.println(n+" is a prime number");
		else
		System.out.println(n+" is not a prime number");
		
	}
}