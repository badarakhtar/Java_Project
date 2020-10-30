package IACSD.JAVA8;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {
public static void main(String[] args) {
	List<String> name=new ArrayList<>();
	name.add("badar");
	name.add("ram");
	name.add("shyam");
	name.add("sita");
	name.add("gita");
	System.out.println(name);
	
	name.stream().filter(f->(f.startsWith("s"))||f.endsWith("m")).forEach(System.out::println);
	
	//ArrayList<String> city=new ArrayList<>();
}
}
