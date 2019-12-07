package JavaCore15.task_1;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("¬вед≥ть 1 , ўоб додати учасника клубу");
		System.out.println("¬вед≥ть 2 , ўоб додати тваринку до учасника клубу");
		System.out.println("¬вед≥ть 3 , ўоб видалити тваринку з учасника клубу");
		System.out.println("¬вед≥ть 4 , ўоб видалити учасника з клубу");
		System.out.println("¬вед≥ть 5 , ўоб видалити конкретну тваринку з≥ вс≥х власник≥в");
		System.out.println("¬вед≥ть 6 , ўоб вивести на екран зооклуб");
		System.out.println("¬вед≥ть 0 , ƒл€ виходу з програми");	
	}
	
	 public static void main (String[] args) {
		 ZooClub zooClub = new ZooClub();
		 Scanner scanner = new Scanner(System.in);
		 
		 while (true) {
			 menu();
			 
			 switch (scanner.nextInt()) {
			 
			 case 1 : {
				 zooClub.addZooClubMember();
				 break;
			 }
			 case 2 : {
				 zooClub.addAnimal();
				 break;
			 }
			 case 3 : {
				 zooClub.removeAnimal();
				 break;
			 }
			 case 4 : {
				 zooClub.addZooClubMember();
				 break;
			 }
			 case 5 : {
				 zooClub.removeAniamalFromMmembers();
				 break;
			 }
			 case 6 : {
				 zooClub.viewZooClub();
				 break;
			 }
			 case 0 : {
				 System.exit(0);
				 break;
			 }
			 default: {
				 System.out.println("¬вед≥ть в≥д 0 до 6 !");
				 break;
			 }
			 }
		 }	 
	 }
}
