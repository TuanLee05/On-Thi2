package code;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Account {
	
	private int id;
	private String name;
	private String email;
	private int balance;
	//a. Getter va setter
	 public int getId() {
		 return id;
	 }
	 public void setId (int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email=email;
	 }
	 public int getBalance() {
	 	return balance;
	 }
	 public void setBalance(int balance) {
		 this.balance=balance;
	 }
	//b.Contructor
	 public Account(int id, String name, String email, int balance) {// ten Contructor giống tên lớp
		 this.id=id;
		 this.name=name;
		 this.email=email;
		 this.balance=balance;
	 }
	 //c.Viết phương thức addAccount cho phép nhập thông tin 1 Account từ bàn phím, trả về Account vừa nhập
	 public static Account addAccount() {
		 Scanner sc= new Scanner(System.in);
		 System.out.printf("Nhập ID: ");
		 int id= sc.nextInt();// Kiểu dữ liệu trả về của nextInt là int
		 sc.nextLine();
		 System.out.printf("Nhập tên: ");
		 String name=sc.nextLine(); // Kiểu dữ liệu trả về của nextLine là String
		 System.out.printf("Nhập email: ");
		 String email=sc.nextLine();
		 System.out.printf("Nhập Số dư: ");
		 int balance=sc.nextInt();
		 sc.nextLine();
		 return new Account(id, name, email,balance);
	 }
	 //d. Tìm kiếm Account theo id và balance
	 public static Account searchAccount(Account[] arr, int _id, int _balance) {
		 for (Account acc : arr) {
			 if (acc.getId()== _id && acc.getBalance()==_balance) {
				 return acc;
			 }
		 }
		 return null;
	 }
	 //e. Sắp xếp các Account theo id tăng hoặc giảm
	 public static void sortAccount(Account[] arr, int k) {
		 if(k%2==0) {
			Arrays.sort(arr, Comparator.comparingInt(Account::getId));
		 }else {
			Arrays.sort(arr, (a, b) ->b.getId() - a.getId());
		 }
	 }
	 //In ra thông tin
	 public void display() {
		 System.out.println("ID: "+id+ ", Tên" +name+ ", Email:" +email+ ", Số dư" +balance);
	 }
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Số Lượng tài khoản");
		int n= sc.nextInt();
		Account[]accounts = new Account[n];		
	
	//Nhập danh sách tài khoản
	for(int i=0;i<n;i++) {
		System.out.println("Nhập tài khoản thứ"+(i+1));
		accounts [i] = Account.addAccount();
	}
	
	//Tìm kiếm
	System.out.print("Nhập ID cần tìm");
	int searchId= sc.nextInt();
	System.out.print("Nhập balance cần tìm");
	int searchBalance= sc.nextInt();
	Account found = Account.searchAccount(accounts, searchId, searchBalance);
	if(found !=null) {
		System.out.print("Tài khoản tìm thấy");
		found.display();
	}else {
		System.out.print("Không tìm thấy tài khoản");
	}
	
	//Sắp xếp
	System.out.print("Nhập số k để sắp xếp");
	int k =sc.nextInt();
	Account.sortAccount(accounts, k);
	System.out.println("Danh sách tài khoản sau sắp xếp là: ");
		for(Account acc : accounts) {
			acc.display();
		}
	
	
	
	}
	
}

