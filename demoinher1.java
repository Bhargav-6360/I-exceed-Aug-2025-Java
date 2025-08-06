class Car
{
	String nameOfCompany;
	boolean IsAvailable;

	Car(String nameOfCompany, boolean IsAvailable)
	{
		this.nameOfCompany = nameOfCompany;
		this.IsAvailable = IsAvailable;
		this.getCarDetails();
	}
	public void getCarDetails()
	{
		System.out.println("Name of Company: " + nameOfCompany);
		System.out.println("Is Available: " + IsAvailable);
		}	}
class Scorpio extends Car
{
	String carName,modelName,color;
	Scorpio(String nameOfCompany, boolean IsAvailable, String carname, String modelName, String color)
	{
		super(nameOfCompany, IsAvailable);
		this.carName = carName;
		this.modelName = modelName;
		this.color = color;
		this.displayCarModel();
	}
	public void displayCarModel()
		{
	       System.out.println("Name of the car"+carName);
		   System.out.println("Model"+modelName);
		   System.out.println("Color"+color);
		}
}
class demoinher1
	{
		public static void main(String[] args)
		{
			Scorpio scorpio = new Scorpio("Mahindra",true,"Scorpio","XUV500","Black");
			//scorpio.getCarDetails();
			//scorpio.displayCarModel();
		}
	}
