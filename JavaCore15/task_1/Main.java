package JavaCore15.task_1;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("������ 1 , ��� ������ �������� �����");
		System.out.println("������ 2 , ��� ������ �������� �� �������� �����");
		System.out.println("������ 3 , ��� �������� �������� � �������� �����");
		System.out.println("������ 4 , ��� �������� �������� � �����");
		System.out.println("������ 5 , ��� �������� ��������� �������� � ��� ��������");
		System.out.println("������ 6 , ��� ������� �� ����� �������");
		System.out.println("������ 0 , ��� ������ � ��������");	
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
				 System.out.println("������ �� 0 �� 6 !");
				 break;
			 }
			 }
		 }	 
	 }
}
