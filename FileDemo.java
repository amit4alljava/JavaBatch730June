import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File class is used to create file, delete file , rename file
		// create dir, give path , scan directory
		// d:\\yourdirectorypath
		File file = new File("/Users/amit/Documents/testing/abcd.txt");
		File md =new File("/Users/amit/Documents/testing/tt/pp/ll/rr");
		//md.mkdir();
		md.mkdirs();
		file.renameTo(new File("xyz.txt"));
		if(file.exists()){
			System.out.println("Yes File Exist ");
			file.delete();
		}
		else
		{
			System.out.println("File Not Exist");
			file.createNewFile();
		}
	}

}
