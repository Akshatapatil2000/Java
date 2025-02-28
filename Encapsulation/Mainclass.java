class MainClass
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.set Id("10");
		s1.set Name("ABC");
		s1.set City("Pune");
		s1.set Percentage(80.23);

		System.out.println("ID:"+s1.getId());
		System.out.println("NAME:"+s1.getName());
		System.out.println("CITY:"+s1.getCity());
		System.out.println("PERCENTAGE:"+s1.getPercentage());	
	}
}