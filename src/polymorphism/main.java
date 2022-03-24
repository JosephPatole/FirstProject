package polymorphism;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Contact contactOne = new Contact("Joseph",new PhoneNumber("9892751059"));
		Contact contactTwo = new Contact("Amol",new PhoneNumber(91,"987777779"));
		Contact contactThree = new Contact("Gawade","988888897865");
		Contact contactFour = new Contact("Huzefa","huzefatolar1995@gmail.com");
		Contact contactFive = new Contact("Huzef","huzefatolar1995@gmail.com",new PhoneNumber("9892751059") );
		
		System.out.println(contactOne);
		System.out.println(contactTwo);
		System.out.println(contactThree);
		System.out.println(contactFour);
		System.out.println(contactFive);
	}

}
