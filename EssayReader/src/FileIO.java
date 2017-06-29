import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	public static final String fileSeparator = System.getProperty("file.separator");
	public static final String lineSeparator = System.getProperty("line.separator");
	
	public ArrayList<String> readFile(String filename) {
		
		Scanner in = null;
		FileReader reader;
		BufferedReader b;
		ArrayList<String> output = new ArrayList<String>();
		
		try {
			reader = new FileReader(filename);
			
			b =new BufferedReader(reader);
			
			in = new Scanner(b);
			
			
			
			while(in.hasNextLine()) {
				String line = in.nextLine();
				output.add(line);
			}
			in.close();
			
			return output;
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null)
				in.close();
		}
		return null;
	}
	
	
	public void writeFile(String filename, ArrayList<String> data) {
		FileWriter writer = null;
		BufferedWriter w = null;
		
		try {
			writer = new FileWriter(filename);
			
			w = new BufferedWriter(writer);
			
			for(String line : data) {
				w.write(line+lineSeparator);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(w != null)
				try { 
					w.close(); 
				} catch(IOException e) {
					e.printStackTrace();
				}
		}

	}
}
