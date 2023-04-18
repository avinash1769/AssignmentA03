package question9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourseTrail {
	static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
	
	FileReader b1 = new FileReader(path);
	BufferedReader b2 = new BufferedReader(b1);
	    try {
	        return b2.readLine();
	    } finally {
	        b2.close();
	        b1.close();
	    }
}
}