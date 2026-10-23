package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class JohnMethod {
	public static void main(String[]args) {
		int id = 2312;
		String filename = Integer.toString(id) + ".txt";
		int damage = 3;
		int hp = 100;
		int variables = 2;
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(Integer.toString(damage));
			writer.write("\n"+ hp);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			int getDamage = 0;
			int getHP = 0;
			for(int i = 1; i<=variables; i++) {
				if(i == 1) {
					getDamage = Integer.parseInt(reader.readLine());
				}else if(i == 2) {
					getHP = Integer.parseInt(reader.readLine());
				}
			}
			System.out.println("Damage: " + getDamage);
			System.out.println("HP: "+ getHP);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
