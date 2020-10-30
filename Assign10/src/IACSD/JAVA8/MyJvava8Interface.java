package IACSD.JAVA8;

public interface MyJvava8Interface {
void add();
default void show() {//non abstract method......default
	System.out.println("Default method from java 8");
}
static void display() {
	System.out.println("Static interface method");
}
//default void done() {
//	System.out.println("Done with interfaces");
//}
}
