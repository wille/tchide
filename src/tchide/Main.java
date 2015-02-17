package tchide;

import java.io.File;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			
			boolean modulo = file.length() % 512 == 0;

			if (modulo) {
				System.out.println("Writing byte to file");
				FileOutputStream fos = new FileOutputStream(file, true);
				fos.write(1);
				fos.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
