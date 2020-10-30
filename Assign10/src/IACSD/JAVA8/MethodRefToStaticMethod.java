package IACSD.JAVA8;
import java.util.ArrayList;

interface printable
{
	void print(String str);
}

public class MethodRefToStaticMethod{
	
public static void printSomething(String str)
{
	System.out.println(str+   "  Hello This is in static method");
}
public void  display(String str)
{
	
	System.out.println(str +"  Welcome in non static metohd");
	
}



	public static void main(String[] args) {
	
		//refering static method
		printable prn=MethodRefToStaticMethod::printSomething;
		
		prn.print("Sonali");
		//refering non-static method
		MethodRefToStaticMethod mrs=new MethodRefToStaticMethod();
		printable p=mrs::display;
		
		p.print("Vaishali ");
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Ram");
		names.add("Sham");
		names.add("Seeta");
		names.add("Geeta");
		names.add("Neeta");
		
		//names.forEach(str->System.out.println(str));
		
		names.forEach(System.out::println);

	}

}