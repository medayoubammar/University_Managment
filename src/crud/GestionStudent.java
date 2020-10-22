package crud;

import java.util.ArrayList;

public class GestionStudent {

	public GestionStudent() {
	
	}
	
	private static  ArrayList<Student> Liste = new ArrayList<>();
	
	
	
	public static ArrayList<Student> getListe() {
		return Liste;
	}

	public static void setListe(ArrayList<Student> liste) {
		Liste = liste;
	}
	
	

	public  static void  AddUser(Student s) {
		
		Liste.add(s);
		
	}
	
	public static void RemoveUser(String ch) {
		
		for(Student etd: Liste) {
			if(etd.getName().equals(ch)) {
				Liste.remove(etd);
				
			}
		}
	}
	
	
	public static Student SearchStudent(String name) {
	
		for(Student etd: Liste) {
			if(etd.getName().equals(name)) {
				return etd;
			}
		}
		
		return null;
		
	}
	
	
	

}
