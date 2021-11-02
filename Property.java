
public class Property {
	private String propertyName, city, owner;
	private double rentAmount;
	private Plot plot=new Plot();;
	
	public Property() {
		propertyName="";
		city="";
		owner="";
		rentAmount=0;
		plot= new Plot();
	}
	
	public Property(Property p) {
		this.propertyName=p.propertyName;
		this.city=p.city;
		this.owner=p.owner;
		this.rentAmount=p.rentAmount;
		this.plot=p.plot;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName=propertyName;
		this.city=city;
		this.owner=owner;
		this.rentAmount=rentAmount;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName=propertyName;
		this.city=city;
		this.owner=owner;
		this.rentAmount=rentAmount;
		this.plot.setX(x);
		this.plot.setY(y);
		this.plot.setWidth(width);
		this.plot.setDepth(depth);
	}
	
	
	public void setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
	}
	public Plot getPlot(){
		Plot tempPlot=this.plot;
		return tempPlot;
	}
	
	public String toString() {
		return "Property Name: "+ this.propertyName +'\n'+ 
				"Located in "+ this.city +'\n'+
				"Belongin to: "+ this.owner+'\n'+ 
				"Rent Amount: "+ this.rentAmount;
	}
	
	//Setter and Getter for name
	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String PropertyName) {
		this.propertyName=PropertyName;
	}
	
	//Setter and getter for city
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	//Setter and Getter for owner
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	//Setter and Getter for owner
	public double getRentAmount() {
		return this.rentAmount;
	}
	public void setRentAmount(double rentalAmount) {
		this.rentAmount=rentalAmount;
	}
}
