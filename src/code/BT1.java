package code;//Chẵn
import java.util.Scanner;
public class BT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập số Nguyên lẽ Chẵn: ");
		int N= scanner.nextInt();
		int S = 0;
		
		if (N%2!=0||N<2) {
			S=-1;
		}else {
			for(int i=2;i<=N;i+=2)
				S+=giaiThua(i);// Tính tổng các số chẵn
		}
		System.out.print("Gia tri Giai thừa của S là: " +S);
	}
	public static long giaiThua(int n) {// Hàm tính giai thừa
		int gt =1;
		for(int i=2;i<=n;i++) {
			gt*=i;
		}
		return gt;
	}
}
