package SimpleAbstarct;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numberofwordncharctrs {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\sv78\\Desktop\\sunil.txt");
		InputStreamReader is=new InputStreamReader(fs);
		BufferedReader br=new BufferedReader(is);
		
		String line;
		int wordscount=0;
		int charctercount=0;
		

		while((line=br.readLine())!=null)
		{
			if(!line.equals(" "))
			{
				charctercount=line.length();
				
				String [] words=line.split("\\s+");
				wordscount=wordscount+words.length;
				
				
				
			}
		}
		System.out.println(wordscount);
		
		System.out.println(charctercount);
	}

}
