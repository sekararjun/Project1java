package oops;

/*1. Create a class Student with attributes and display details.
2. Use constructor to initialize class objects.
*/
class Students{
	String name;
	int standard;
	String game;
	
	public Students(String name){
     this.name=name;
	}
	public void reading() {
		System.out.println(name +" reading the book");
	}
	public void playing() {
		System.out.println(name+" is playing "+game);
	}
}

public class OopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="sekar";
        Students sekar=new Students(name);
        sekar.standard=10;
        sekar.game="cricket";
		sekar.reading();
		sekar.playing();
	}

}
