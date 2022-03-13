

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


 
public class AssQ3 {

	public static void main(String[] args) {

		Address address=new Address("49, vijay nagar", "indore", "India");
		Employee employee=
				new Employee(101, "amit", address, 400000);
		
	
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("temp.ser")));
			oos.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		employee=null;
		try {
			ObjectInputStream oos=new ObjectInputStream(new FileInputStream(new File("temp.ser")));
			employee=(Employee) oos.readObject();
			System.out.println(employee);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}







