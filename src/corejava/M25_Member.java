/*
 [25] Create a class named 'Member' having the following members: 1. Data members 2. Name 3. Age 4. Phone number 5. Address 6. Salary It also has a method named 'printSalary' which prints the salary of the members. 
 */

package corejava;

class DataMember
{
	String name,address;
	int age;
	long contact;
	double salary;

	public DataMember(String name,int age,long contact,String address,double salary)
	{
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.salary = salary;
	}

	public void salary()
	{
		System.out.println("Salary of "+name+" is: "+salary);
	}
}

public class M25_Member {

	public static void main(String[] args) {

		DataMember d = new DataMember("Siya", 24, 9087896578l, "Mota Taiwad", 35000);
		d.salary();
	}
}
