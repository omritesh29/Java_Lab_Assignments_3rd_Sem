class Person{
	String name;
	int age;
	Person(String n, int a){
		name = n;
		age = a;
	}
	void display(){
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
	}
	public static void main(String args[]){
		Person P = new Person("Om Ritesh",21);
		Person P1 = new Person("Ayush",20);
		P.display();
		P1.display();
	}
}