package co.uk.ubs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class AuthorTest {

	private static final String INPUT_FILE = "C:\\temp\\authorFileToBeRead.txt";
	
	private static Map<String, Integer> myMap = new LinkedHashMap<String, Integer>();
	
	private static String[] splinters;
	
	public static void main(String[] args) {
		//entry parameters
		if (args.length>0) {
			for (int x=0;x<args.length;x++) {
				splinters = lowerCase(args);
			}
			loadMap();
			showInformation();
		} else {
			//Using a file as an entry point
			fileEntry();
		}
	}
	
	private static void fileEntry () {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(INPUT_FILE));
			String buffer;
			while((buffer=br.readLine())!=null) {
				splinters = lowerCase(buffer.split(" "));
				loadMap();
			}
			showInformation();
		} catch (FileNotFoundException fnfe) {
			System.out.println("Please, make sure the requested file exists in your file system");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			if (br!=null) {
				try {
					br.close();	
				} catch (IOException ioe) {
					System.out.println("Error thrown while closing resources");
					ioe.printStackTrace();
				}
			}
		}
	}

	private static String[] lowerCase(String[] splinter) {
		String[] splinterAux = new String[splinter.length];
		for (int z=0; z<splinter.length; z++) {
			splinterAux[z] = splinter[z].toLowerCase().replace(".", "").replace(",", "").replace("(","").replace(")","").trim();
		}
		return splinterAux;
	}
	
	private static void loadMap() {
		for (String s: splinters) {
			if (myMap.containsKey(s)) {
				myMap.put(s, myMap.get(s)+1);
			} else {
				myMap.put(s, 1);
			}
		}
	}
	
	private static void showInformation() {
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}		
	}
}
