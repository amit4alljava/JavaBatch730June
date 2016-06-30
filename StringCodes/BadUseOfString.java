import java.util.Scanner;

public class BadUseOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//"select * from products where type='Mobile'";
		//String sql = "select * from products where type=";
		StringBuffer sql = new StringBuffer("select * from products where type=");
		System.out.println("Enter the Product Type to Search");
		String itemName =  scanner.next();
		//sql = sql + "'"+itemName+"'";
		sql.append("'").append(itemName).append("'");
		System.out.println("Enter the Price to Search");
		double price = scanner.nextDouble();
		//sql = sql + " and price>"+price;
		sql.append(" and price>").append(price);

	}

}
