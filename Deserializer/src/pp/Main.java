package pp;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\cleme\\eclipse-workspace\\Serializer\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream (fileIn);
		user = (User)in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
	    System.out.println("serialVersionUID: "+serialVersionUID);
	}

}
