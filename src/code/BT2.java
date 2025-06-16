package code;
import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên lẽ N: ");
		int N= scanner.nextInt();
		int S=0;
		if(N %2 ==0 || N<1) {
			S=-1;
		}else {
			for(int i=1;i<=N;i+=2)
			S+=giaiThua(i);
		}
		System.out.print("Gia tri gia thua của N là: " +S);
	}
	public static int giaiThua(int n) {
		int gt=1;
		for(int i=1;i<=n;i++) {
			gt*=i;
		}
		return gt;
	}
	
	

}
