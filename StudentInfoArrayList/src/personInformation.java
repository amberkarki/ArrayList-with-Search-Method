import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class personInformation {

	public static void main(String[] args) {
		
		
		
		
Comparator<Person> comAge =new Comparator<Person>() {//  Comparator for to compare by age  
			
			
			public int compare(Person age1, Person age2) {
				int a1=age1.getAge();
				int a2=age2.getAge();
				if(a1>a2)
				{
					return 1;
				}
				
				else {
					return -1;
				}
			

			
			
		}
			
		};
		
Comparator<Person> comName =new Comparator<Person>() {
			
			
			public int compare(Person name1, Person name2) {
				String n1=name1.getName();
				String n2=name2.getName();
				return n1.compareTo(n2);

			
			
		}
			
		};
		
		
		Scanner input=new Scanner (System.in);
		ArrayList<Person>person=new ArrayList<Person>(); // Comparator for to compare by name .    
		
		int age=0;
boolean found =true;
System.out.println("**Empty Name will terminate this simple Programe**");
System.out.println("----------------------------------------------------");
while(found!=false)
{
	System.out.println("Enter your Name: ");
	String name=input.nextLine();
	if(name.isEmpty())
	{
		found=false;
		break;
	}
	System.out.print("Enter your Age:  ");
	age=input.nextInt();
	person.add(new Person(name,age));
	input.nextLine();
	
	}

Collections.sort(person,comName);

System.out.println();

System.out.println("**Printing all the records**");

for(Person d:person)// for each loop to  print all the records 
{
	
	System.out.println("Name: "+ d.getName()+" ;"+ "Age: "+d.getAge());
	
	}
System.out.println();// single empty line printing 

	System.out.println("**After sorting***");
	
	Collections.sort(person,comAge);// sort method to sort ArrayList 

	for(Person c:person) // for each loop  to print all records after  Collections.sort method
	{
		
		System.out.println("Name: "+ c.getName()+" ;"+ "Age: "+c.getAge());
		
		}
	
	System.out.println();
	
System.out.println("====Search Your Name By Age :====");

		boolean flag=false;
		int search=0;
		System.out.println("Enter your Age:");
		search=input.nextInt();
		
		if(!person.isEmpty()) // if person Array is not Empty then  it will search
		{
			for(Person e:person)
			{
				if(e.getAge()==search)
				{
					flag=true;
					System.out.println("Name:  " +e.getName() +"  , "+ "Age: "+ e.getAge());
				}
				
			}
			if(flag==false) // flag is not true then Unknown Search Item
			{
				System.out.println("Unknkown  Search Item !! No record found in the Array !!");
			}
			
		}
		else
		{
			System.out.println("Unknown !! Due to The Empty Array ! ");
			
			
		}
	}
}

