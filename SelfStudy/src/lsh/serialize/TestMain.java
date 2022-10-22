package lsh.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {

	private static String fileName = "test.dat";

	public static void main(String[] args) {

		// desc ���� ���� �κ�
		Member m = new Member(1, "John Doe", 500);

		
		System.out.println(m.toString());
		
		
		try {
			
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// desc ���� �о���� �κ�
		Member mm = null;
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			mm = (Member)ois.readObject();
			fis.close();			
			
			System.out.println(mm.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
