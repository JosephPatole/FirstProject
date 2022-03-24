package polymorphism;

public class Contact 
{
	private String name;
	private String emailAddress;
	private PhoneNumber phoneNumber;
	
	public Contact(String name, String emailAddress, PhoneNumber phoneNumber)
	{
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String name, String emailAddress)
	{
		this.name = name;
		this.emailAddress = emailAddress;
	}
	
	public Contact(String name, PhoneNumber phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return "Contact { name= " + name + " phoneNumber= " + phoneNumber + " emailAddres= " + emailAddress +"}";
		
	}

}
