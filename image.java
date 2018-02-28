import java.io.*;

public class Image{

	public static void main(String[] args){
		try {
			FileWriter xD = new FileWriter("image.ppm");
			BufferedWriter yD = new BufferedWriter(xD);
			yD.write("P3\n550 550\n255\n");
			int x=0;
			int y=0;
			int z=0;
			for (int i = 0; i < 550; i ++){
				for (int j = 0; j < 550; j ++){
					yD.write(Integer.toString(x) + " " + Integer.toString(y) + " " + Integer.toString(z) + " ");
					x+=3;
					y+=2;
					//z *=2;
				}
				yD.newLine();
			}
			yD.close();
		}





		catch (Exception e) {
			e.printStackTrace();
		}
	}

}