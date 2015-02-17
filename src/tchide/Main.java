package tchide;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			
			boolean modulo = file.length() % 512 == 0;

			System.out.println("Modulo: " + modulo);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
