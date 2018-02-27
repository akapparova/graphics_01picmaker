import java.io.*;

public class Image{

	public static void main(String[] args){
		try {
			FileWriter x = new FileWriter("image.ppm");
			BufferedWriter y = new BufferedWriter(x);
			y.write("P3\n550 550\n255\n");
			for (int i = 0; i < 550; i ++){
				for (int j = 0; j < 550; j ++){
					y.write(s + s);
				}
				y.newLine();
				for (int j = 0; j < 256; j ++){
					String s = "0 " + Integer.toString(i) + " " + Integer.toString(j) + " ";
					y.write(s + s);
				}
			}
			y.close();
		}





		catch (Exception e) {
			e.printStackTrace();
		}
	}

}