import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

class UseFinally{
	static void readFile() throws IOException,FileNotFoundException{
		String filePath = "d:/Users/amit/Documents/JavaCodes/ExceptionHandlingDemo/src/TryCatchFinally.java";
		FileInputStream fi = null;
		final int EOF = -1;
				try{
					fi =new FileInputStream(filePath); // File Open
					// Reading File Code
					int singleByte = fi.read();
//					if(10>2){
//						System.exit(0); // in this case finally not execute
//						//return;
//					}
//					int e = 100/0;
					while(singleByte!=EOF){
						System.out.print((char)singleByte);
						singleByte = fi.read();
					}
					
				}
//				catch(FileNotFoundException e){
//					System.out.println("This file is Not Exist in this Path");
//				
//				}
//				catch(IOException e){
//					System.out.println("Can't Read the File");
//				}
				finally{
					System.out.println("Finally Run......\n");
					if(fi!=null){
						try {
							fi.close();
						} catch (IOException e) {
							System.out.println("Exception in File Close");
						}
					}
				}
				
	}
}
public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// finally is a block 
		// and this block will execute always
		// finally is used for resource clean up
		// Multiple Catch block (Be Specific)
		try {
			UseFinally.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Path Not Exist "+e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem in File Read "+e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e){
			System.err.println("Contact to System Admin , Something MisHappen");
		}

	}

}
