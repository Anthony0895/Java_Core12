package lgs1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList <Auto> auto = new ArrayList <Auto>(20);
		ArrayList <String> material = new ArrayList <String>(2);
		material.add("Leather");
		material.add("Alcantara");
		
		//Auto[][] auto = new Auto[1+rand.nextInt(5)][1+rand.nextInt(5)];
		//String[] material = {"Alcantara","Leather"};
		
		Scanner scanner = new Scanner (System.in);
		String s;
		
		while (true) {
			menu();
			s=scanner.nextLine();
			switch (s) {
			case "1": {
				//for (int i = 0; i < rand.nextInt(20); i++) 
					for (int i = 0; i < auto.size(); i++){
						Engine engine = new Engine(3 + rand.nextInt(10) % 9);
						Wheel wheel= new Wheel (20 + rand.nextInt(10), material.get(rand.nextInt(2)));
						auto.add(new Auto(100 + rand.nextInt(300), 1970 + rand.nextInt(50), wheel, engine));
					}
				}
				System.out.println("Random element");
				System.out.println(auto);
				break;
			
			case "2": {
				//Auto defaultAuto = new Auto(75, 2012, new Wheel(25, material.get(0)), new Engine(4));
               // auto.clear();
				//for (int i = 0; i < defaultAuto.size(); i++)
				auto.add(new Auto(75, 2012, new Wheel(25, material.get(0)), new Engine(4)));
				System.out.println("Default element");
				System.out.println(auto);
				break;
			}
			case "3": {
				 System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + s);

			}
		}
	}

	private static void menu()
	{
		System.out.println("Press 1 to print all ellements of the array whith random component");
		System.out.println("Press 2 to print all ellements of the array whith default component");
		System.out.println("Press 3 to exit");
		
	}
}