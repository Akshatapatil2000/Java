Class Student
{
	private int id;
	private string name;
	private string city;
	private double percentage;

	//setter methods
	public void setId(int id){
	this.id=id;
	}
	public void setName(String name){
	this.name = name;
	}
	public void setCity(String city){
	this.city = city;
	}
	public void setPercentage(double percentage){
	this.percentage = percentage;
	}
	
	//getter method

	public int getId(){
	return id;
	}
	public String getName(){
	return name;
	}
	public String getCity(){
	return city;
	}
	public double getPercentage(){
	return percentage;
	}
}



