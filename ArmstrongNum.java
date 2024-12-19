import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ArmN(n));
		sc.close();
	}

	public static boolean ArmN(int n){
		int count = 0;
		int sum = 0;
		int dup = n, orig = n;
		while(dup>0){
			count++;
			dup/=10;
		}
		for(int i = 0; i < count; i++){
			int ld = n%10;
			sum += Math.pow(ld,count);
            n /= 10;
		}
		if(sum == orig)
			return true;
		return false;
	}
}
