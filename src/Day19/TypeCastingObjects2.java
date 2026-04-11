package Day19;
//Cat ct=(Cat) an;
//A   b    c   d
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObjects2 {
public static void main(String[] args) {
	
// Rule 1: Conversion is valid or not
// The type of 'd' and 'c' must have some relationship(either parent to child or child to  parent class)
	Animal an=new Dog();
	Cat ct=(Cat) an;  //Downcasting valid as per Rule 1 (Cat is derived from Animal an)
	Dog dg=new Dog();
//	Cat ct=(Cat) dg; Not Valid as Dog and Cat are two different classes having no relation between them
	
	//Rule 2 : Assignment is valid or not(After converting 'C'must be either same or child of 'A')*************
	//'C'must be either same or child of 'A'
	Animal a=new Dog();
	Cat ct1=(Cat) a;	//  valid as per Rule 2
	
	Animal a2=new Dog();
//	Cat ct2=(Dog) a2;	   Invalid as per Rule 2
	
	//Rule 3: The Underlying object of type 'd' must be either same or child of 'C'.
// If rule 3 fails we will get RunTime Error	
	
/*	Animal a3=new Dog();
	Cat c3=(Dog) a3;	//Invalid as per Rule 2
	Animal a4=new Dog();
	Cat c4=(Cat) a4;	//Invalid as per Rule 3
	
*/	//Rule1, Rule2 and Rule3
	Animal a5=new Dog();
	Dog d2=(Dog) a5;  //Rule1, Rule2 & Rule3 --Satisfied
	
}

}
