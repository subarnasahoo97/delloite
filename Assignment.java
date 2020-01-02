package iodemos;

import java.io.File;
import java.io.IOException;

public class Assignment {
	public static void main(String[] args) throws IOException {
		 File file=new File("c:\\delloite\\Batch\\Batchmates.txt");
			 file.createNewFile();
			 
			 File dir = new File("C:\\delloite\\Batch");
				File[] files = dir.listFiles();
				for(File f: files){
					if(f.isFile()) {
					System.out.println(f.getName() +" is a file.");
				     }
					else if(f.isDirectory()) {
						System.out.println(f.getName() +" is a directory");
						}
				}

	}
}
