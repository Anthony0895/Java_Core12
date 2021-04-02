package My_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class My_Main {

	public static void main(String[] args) {
		
		ArrayList animal = new ArrayList();
		animal.add("America");
		animal.add(new Animal ("Camel","Africa",8));
		animal.add(2, null);
		animal.add(3,"Cobra");
		
		animal.remove(0);
		animal.set(0,6);
		
		System.out.println(animal.size());
		System.out.println(animal.get(1));
		System.out.println(animal);

		}	
	}

