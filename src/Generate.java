import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generate {
	
	
	public static void main(String[] args) throws IOException{
		
		File file = new File("curves.csv");
		FileWriter fileWriter = new FileWriter(file);
		int iterations = 200;
		while(iterations>0){
			int midPoint = getRandomNumberInRange(3,7);
			int height = getRandomNumberInRange(0,10);
			fileWriter.write("10/​(1+​e^​(‑1(x-​"+midPoint+")))+"+height);
			fileWriter.write(",10/​(1+​e^​(1​(x-​"+midPoint+")))+"+height);
			fileWriter.write(System.getProperty("line.separator"));
			iterations--;
		}
		fileWriter.close();
		
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	
	
}
