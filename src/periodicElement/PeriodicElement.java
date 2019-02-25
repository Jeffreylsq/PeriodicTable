package periodicElement;

public class PeriodicElement {
	
	 String atmoic;
	 String ab;
	 String name;
	 String weight;
	 
	 PeriodicElement(){
		 
	 }
	 PeriodicElement(String atmoic, String ab, String name, String weight){
		 this.atmoic = atmoic ;
		 this.ab = ab;
		 this.name = name;
		 this.weight = weight;
		 
	 }
	 
	 public String toString()
	 {
		 String str = (atmoic) + " " + ab + " " + name + "\t" +  weight;
		 return str;
	 }
}
