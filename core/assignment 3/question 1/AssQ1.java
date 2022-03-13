

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssQ1 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
	try {
		FileInputStream fr = new 
					 FileInputStream("C:\Users\w2c\Desktop");
		FileOutputStream fw = 
				new FileOutputStream("C:\Users\w2c\Desktop\Screenshot (243).png");
					BufferedInputStream fr = new 
					BufferedInputStream(new FileInputSC:\Users\w2c\Desktop\Screenshot (243).png"));
			BufferedOutputStream fw = new BufferedOutputStream(
					new FileOutputStream("C:\Users\w2c\Desktop\Screenshot (243).png"));
			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.close();
	} catch (FileNotFoundException e) {
        e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		}

	long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");
				
		try {
			FileReader fr=new FileReader("C:\Users\w2c\DesktoP\Screenshot (243).png");
			FileWriter fw=new FileWriter("C:\Users\w2c\Desktop\Screenshot (243).png");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("file is written");
	}
}
