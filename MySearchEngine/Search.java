package MySearchEngine;

import java.io.File;
import java.util.Scanner;
import Jpedal;

//Open a PDF document scan through it for a given string and returns the number of times the pdf contains the string 

public class Search {
	
	private String searchterm;
	
	private File filename ;
	
	
	
	public Search(String searchterm, File filename) {
		this.searchterm = searchterm;
		this.filename = filename;
	}
	
	public void SearchFile (String searchterm , File filename) {
		
		try {
		
			Scanner scanner = new Scanner(filename);
			
			
			
		}
		
		catch{
			
			
		}
		
	}
	
	
}
