import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row,column;
System.out.println("Mayýn tarlasýna hoþgeldiniz !");
System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz !");
System.out.print("Satýr sayýsý:");
row=scan.nextInt();
System.out.print("Sütün sayýsý:");
column = scan.nextInt();

MayinTarlasi mayin=new MayinTarlasi(row,column);
mayin.run();
	}
}
