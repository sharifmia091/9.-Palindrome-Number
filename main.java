import java.util.Scanner;
public class palindromNumber09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the number: ");
		int num = input.nextInt();
		palindromNumber(num);

	}
	
	public static void palindromNumber(int num) {
		int reverse=0;
		int number=num;
		
		while(num!=0) {
			reverse=num%10+reverse*10;
			num=num/10;
		}
		if (reverse==number && number>=0) {
			System.out.println("it is a palindrom");
		}
		else
			System.out.println("it is not a palindrom");
		
		
	}

}
