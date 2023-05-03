package titanticData;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class fileStreamTestTitanic {
	public static void main(String [] args) throws OutOfRangeException {
		
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		ArrayList<Passenger> Titanic = new ArrayList<Passenger>();
		
		try {
			inputStream = new Scanner (new FileInputStream("titanic_data.txt.txt"));
			outputStream = new PrintWriter (new FileOutputStream("Titantic_Report"));
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Problem opening Files");
			System.exit(0);
		}
		
	int c;
	String s;
	boolean a,d = false;
	while (inputStream.hasNextLine()) {
		c=inputStream.nextInt();
		System.out.print(c);
		a=inputStream.hasNextLine();
		System.out.print(d);
		s=inputStream.nextLine();
		System.out.println(s);
		d=inputStream.hasNextLine();
		System.out.println(d);
		Titanic.add(new Passenger(c,a,s,d));
	}
	
	for(int i = 0; i < Titanic.size(); i++) {
		outputStream.println(Titanic.get(i));
	}
	
	System.out.printf("The percent of child surviviors were %.4f", childSurvivor(Titanic));
		
	inputStream.close();
	outputStream.close();
		
	}
public static double childSurvivor (ArrayList<Passenger> Titanic){
	int pass =0 ;
	double child = 0;
	for(int i=0; i<Titanic.size(); i++) {

		if((Titanic.get(i).getChild()==true) && (Titanic.get(i).getSurvivor()==true)) {
		child++;
		pass++;
		}
		else {
		pass++;
		} 
}
	child = (child/pass);
	return child;
}

public static double adultSurvivor (ArrayList<Passenger> Titanic){
	int pass=0;
	double adult=0;
	for(int i=0; i<Titanic.size(); i++) {

		if((Titanic.get(i).getChild()==false) && (Titanic.get(i).getSurvivor()==true)) {
		adult++;
		pass++;
		}
		else {
		pass++;
		} 
}
	adult = (adult/pass);
	return adult;
}

public static double maleSurvivor (ArrayList<Passenger> Titanic){
	int pass=0;
	double male=0;
	for(int i=0; i<Titanic.size(); i++) {

		if((Titanic.get(i).getSex().equals("male")) && (Titanic.get(i).getSurvivor()==true)) {
		male++;
		pass++;
		}
		else {
		pass++;
		} 
}
	male = (male/pass);
	return male;
}


public static double femaleSurvivor (ArrayList<Passenger> Titanic){
	int pass=0;
	double female=0;
	for(int i=0; i<Titanic.size(); i++) {

		if((Titanic.get(i).getSex().equals("female")) && (Titanic.get(i).getSurvivor()==true)) {
		female++;
		pass++;
		}
		else {
		pass++;
		} 
}
	female = (female/pass);
	return female;
}

}//end calss