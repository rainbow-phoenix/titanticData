package titanticData;
/**
*@author ranis
*@version March 15, 2021
*/
import java.util.Scanner;
public class Passenger {
   
   Scanner keyboard= new Scanner(System.in);

	private int status;
	private boolean child;
	private String sex;
	private boolean survivor;
	
	public Passenger() {
		status=0;
		child=false;
		sex="";
		survivor=false;
	}
	

   public Passenger(int c, boolean t, String s, boolean a) {
	   status=c;
		child=t;
		sex=s;
		survivor=a;
	
   }
	
//setters
	public void setStatus (int c) {
		status=c;
	}
	
	public void setChild (boolean t) {
		child=t;
	}
	
	public void setSex (String s) {
		sex=s;
	}
	
	public void setSurvivor (boolean a) {
		survivor=a;
	}
	
	
//getters
	
	public int getStatus () {
		return status;
	}
	
	public boolean getChild () {
		return child;
	}
	
	public String getSex () {
		return sex;
	}
	
	public boolean getSurvivor () {
		return survivor;
	}
	
	
//String toString
	public String toString() {
		String s="";
			//Status
			if(this.getStatus()==1) 
				s= this.getStatus() + "st Class|";
			else if(this.getStatus()==2) 	
				s= this.getStatus() + "nd Class|";
			else if(this.getStatus()==3)
				s= this.getStatus() + "rd Class|";
			else if(this.getStatus()==4) 
				s= "Crew|";
				
			//Child or Adult
			if(this.getChild()==false)
				s=s+ " Adult|";
			else
				s=s+ " Child|";
			
			//Male or Female
			s=s+ this.getSex() + "|";
			
			//Survivors
			if(this.getSurvivor()==true)
				s=s+ " Survived";
			else
				s=s+ " Deceased";
		return s;
	}
}