package code;
import java.util.Scanner;
public class BT3 {
	// 2. Viết chương trình in ra màn hình các số 
	//nguyên tố có trong 1 mảng các số nguyên có chiều dài N. Mảng này nhập từ bàn phím.
	
	
	
	//Hàm Kiểm Tra SNT
	public static boolean KTraSNT (int number){
		if(number<2) return false;
		for (int i =2; i<=Math.sqrt(number);i++) {
			if (number%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhập độ dài của mảng
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int array[]= new int[n];
		
		//Nhập các phần tử của mảng
		System.out.println("Nhập các phần tử của mảng: ");
			for(int i=0;i<n;i++) {
				array[i]=scanner.nextInt();
			}

		//In ra các phần tử trong mảng
			
		System.out.print(" Các số nguyên tố có trong mảng là ");
			for(int i=0;i<n;i++) {
				if(KTraSNT(array[i])) {
					System.out.print(array[i]+ " ");
				}
			}
	}

}
