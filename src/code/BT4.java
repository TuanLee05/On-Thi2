package code;
import java.util.Scanner;
import java.util.Arrays;
public class BT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//Nhập số phần tử của mảnh
		System.out.print("Nhập số phần tử của mảng: ");
		int n= scanner.nextInt();
		int array[]= new int[n];
		
		//Nhập các phần tử trong mảng
		System.out.printf("Nhập các phần tử của mảng ");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();	
		}
		//Sắp xếp theo thứ tự tăng dần
		Arrays.sort(array);
		
		//in ra mảng sau khi sắp xếp
		System.out.print("Mảng sau khi sắp xếp tăng dần");
		for (int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		
		
		
		
	}

}
