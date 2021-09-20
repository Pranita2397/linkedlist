package comparator;

import java.util.Comparator;

public class student implements Comparable {
	int rn;
	String name;
	int age;
	String city;
	double fees;

	
	
	
		public int getRn() {
		return rn;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public double getFees() {
		return fees;
	}
	
		
	public student(int rn, String name, int age, String city, double fees) {
		super();
		this.rn = rn;
		this.name = name;
		this.age = age;
		this.city = city;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "student [rn=" + rn + ", name=" + name + ", age=" + age + ", city=" + city + ", fees=" + fees + "]";
	}
	@Override
	public int compareTo(Object o1) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Age implements Comparator <student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.age-o2.age;
	}
	}
class Name implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
---------------------------------------------------------------continue----------
package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {

public static void main(String[] args) {
	student s=new student(101,"pranita", 22, "baramati", 1000);
	
	
	
	LinkedList<student>lls=new LinkedList<student>();
	lls.add(s);
	lls.add(new student(102,"shweta",19,"mumbai",6000));
	lls.add(new student(103,"shraddha",20,"nagar",17000));
	lls.add(new student(104,"ashwini",21,"karegoan",8000));
	System.out.println("---------------Before sorting-----------------------");
	for(student s1:lls)
	System.out.println(s1);
	
	System.out.println("----------------------after sorting by roll no using inner class-----------------------");
	Comparator<student> rn=new Comparator<student>() {
		public int compare(student o1, student o2) {
			
			return o1.rn-o2.rn;
		}
  };
  Comparator<student> c=new Comparator<student>() {
		public int compare(student o1, student o2) {
			
			return o1.city.compareTo(o2.city);
 
		}
};
  Collections.sort(lls);
  for(student s1:lls)
		System.out.println(s1);
  
  System.out.println("----------------------after sorting by age using outer class---------------------");
	Collections.sort(lls,new Age());
	for(student s1:lls)
		System.out.println(s1);
	
	 System.out.println("----------------------after sorting by name using outer class---------------------");
Collections.sort(lls, new Name());
for(student s2:lls)
	System.out.println(s2);

System.out.println("----------------------after sorting by city using inner class---------------------");
Collections.sort(lls,c);
for(student s1:lls)
		System.out.println(s1);

}
}
	


