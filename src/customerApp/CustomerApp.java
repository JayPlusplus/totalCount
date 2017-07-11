package customerApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*Customer Number: 9
Mr. Robert Dupree
4101 Pickens Way
Longview, TX 75601
RobertODupree@einrot.com
Mapping technician at Irving's Sporting Goods
Press (1) to search for another customer or press (2) to Edit the customer's address.*/

public class CustomerApp {
	public static void main(String[] args) {
		
		MethodClass obj = new MethodClass();
		int a;
		System.out.println("Press (1) to search for another customer or press (2) to Edit the customer's address.");
		Scanner keyboard=new Scanner(System.in);
		a = keyboard.nextInt();
		if (a == 1) {
		   obj.method1();
		//update Customers set firstname = 'Vanessa', lastname = 'Smith'
	}			//  where firstname = 'Vanesa' and lastname = 'Brown';
		if (a == 2) {
			obj.method2();
				
		}
	}
}
