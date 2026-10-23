package p;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.name = "Clement";
		user.password = "i<3pizza";
		user.sayHello();
		
		FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(user);
		out.close();
		fileout.close();
		
		System.out.println("Object Info Saved :)");
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
	    System.out.println("serialVersionUID: "+serialVersionUID);
	}

}
