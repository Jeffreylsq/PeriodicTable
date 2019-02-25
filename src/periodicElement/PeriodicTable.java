package periodicElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class PeriodicTable {

	
	 protected String fileName;
	 protected PeriodicElement [] elements = {};
	 
	 PeriodicTable(String fileName) throws FileNotFoundException{
		 
		 File file = new File(fileName);
		 Scanner input = new Scanner(file);
		 while(input.hasNextLine())
		 {
			 String []str = input.nextLine().split(" ");
			 
			elements = Arrays.copyOf(elements, elements.length + 1);
			elements[elements.length -1] = new PeriodicElement(str[0],str[1],str[2],str[3]);
		 }
		 input.close();
		 
	 }
	 
	 public int getNumberOfElements(){
		 
		 return elements.length;
		 
	 }
	 
	 public String findElement(String at){
		 
		String str = null;
		 for(int i = 0 ; i < elements.length ; i++)
		 {
			 if(at.equals(elements[i].atmoic))
			 {
				 str =  elements[i].toString();
			 }
		 }
		return str; 
	 }
	 public String findAbbreviation(String abbr) {
		 
		 String str = null;
		 for(int i = 0 ; i < elements.length ; i++) {
			 
			 if(abbr.toUpperCase().equals(elements[i].ab.toUpperCase()))
			 {
				 str = elements[i].toString();
			 }
		 }
		 return str;
		 	 
	 }
	 
	 
	 public void printTable()
	 {
		 System.out.println("A# "+ " " + "Ab " + " " + "Name" + "\t" + "Weight");
		 System.out.println("---"+ " " + "---" + " " + "------------" +"-------");
		 for(int i = 0 ; i < elements.length ; i++)
		 {
			System.out.println(elements[i].toString());
		 }
	 }
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter file name");
		String str = kb.next();
		PeriodicTable pt = new PeriodicTable(str);
		
		System.out.println("**********Periodic Table by Tianyu. **********");
		System.out.println("Number of elements: " + pt.getNumberOfElements());
		System.out.println();
		
		System.out.println("1. Search atmoic number ");
		System.out.println("2. Search abbreviation");
		System.out.println("3. Print table");
		System.out.println("4. Exit");
		System.out.println();
		System.out.println("Enter your choice");
		
		int choice = kb.nextInt();
		
		switch(choice){
		
		case 1:
			System.out.println("1. Search atmoic number ");
			String at = kb.next();
			System.out.println(pt.findElement(at));
			break;
		case 2:
			System.out.println("2. Search abbreviation");
			String abb = kb.next();
			System.out.println(pt.findAbbreviation(abb));
			break;
		case 3:
			System.out.println("3. Print table");
			pt.printTable();
			break;
		case 4:
			break;
		default:
			System.out.println("Invaild Option");		
		}
		
	
		
	}

}
