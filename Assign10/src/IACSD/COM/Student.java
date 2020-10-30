package IACSD.COM;

import java.util.Scanner;
import java.util.StringJoiner;

public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, rollNo;
		StringJoiner skills=new StringJoiner(",");
		StringJoiner sinfo=new StringJoiner(",");
		System.out.println("Enter Name: ");
		name=sc.next();
		sinfo.add(name);
		System.out.println("Enter RollNo: ");
		rollNo=sc.next();
		sinfo.add(rollNo);
		System.out.println();
		System.out.println("1) Add Skills: ");
		System.out.println("2) Display Info and Exit");
		boolean flag=false;
		while(flag!=true) {
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter your skills: ");
				String s=sc.next();
				skills.add(s);
				break;
			case 2:
				System.out.println("....................");
				System.out.println("Display Info:");
				System.out.println(sinfo);
				System.out.println("Skills: ");
				System.out.println(skills);
				System.out.println("................");
				flag=true;
				System.exit(0);
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
	}
}
