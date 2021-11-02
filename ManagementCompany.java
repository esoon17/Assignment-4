
public class ManagementCompany {
	private int MAX_PROPERTY=5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private int MGMT_WIDTH=10;
	private int MGMT_DEPTH=10;
	private Plot plot;
	
	public ManagementCompany() {
		this.mgmFeePer=0;
		this.name="";
		this.properties=new Property[MAX_PROPERTY];
		this.taxID="";
		this.plot=new Plot();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name=name;
		this.taxID=taxID;
		this.mgmFeePer=mgmFee;
		this.properties=new Property[MAX_PROPERTY];
		this.plot=new Plot();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name=name;
		this.taxID=taxID;
		this.mgmFeePer=mgmFee;
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		this.properties=new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name=otherCompany.name;
		this.taxID=otherCompany.taxID;
		this.mgmFeePer=otherCompany.mgmFeePer;
		plot.setX(otherCompany.plot.getX());
		plot.setY(otherCompany.plot.getY());
		plot.setWidth(otherCompany.plot.getWidth());
		plot.setDepth(otherCompany.plot.getDepth());
		this.properties=new Property[MAX_PROPERTY];
	}
	
	//setter and getter for MAX_PROPERTY
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public int addProperty(Property property) {
		if (property==null)
			return -2;
		
		//Checks array
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i]==null) {
				properties[i]=property;
				return i;
			}
		}
		return -1;
	}
	
	public int addProperty(String name,String city,double rent,String owner) {
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i]==null) {
				Property newProperty= new Property(name, city, rent, owner);
				properties[i]=newProperty;
				return i;
			}
		}
		return -1;
	}
	
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i]==null) {
				Property newProperty= new Property(name, city, rent, owner, x, y, width, depth);
				properties[i]=newProperty;
				return i;
			}
		}
		return -1;
	}
	
	public double totalRent() {
		double total=0;
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i]==null){
				continue;
			}
			total+=properties[i].getRentAmount();
		}
		return total;
	}
	
	public double maxRentProp() {
		double max=0;
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i]==null){
				continue;
			}
			if(properties[i].getRentAmount()>=max)
				max=properties[i].getRentAmount();
			
		}
		return max;
	}
	
	private int maxRentPropertyIndex() {
		int index=0;
		double max = 0;
		for (int i=0; i<MAX_PROPERTY; i++)
		{
			if(properties[i].getRentAmount()>max)
				index = i;
		}
		return index;
	}
	
	private String displayPropertyAtIndex(int i){
		return properties[i].toString();
	}
	
	public String toString() {
		String list = "";
		list+="List of the properties for Alliance, taxID: " + this.taxID + '\n'+
				"______________________________________________________" + '\n';
		for(int i=0; i<MAX_PROPERTY; i++) {
			list +=	"Property Name: " + properties[i].getPropertyName() + '\n' +
					"Located in " + properties[i].getCity() + '\n' +
					"Belonging to: " + properties[i].getOwner() + '\n' +
					"Rent Amount: "+ properties[i].getRentAmount() + '\n';
		}
		list+="______________________________________________________" + '\n' +
				"total management Fee: " + (mgmFeePer * maxRentProp());
		return list;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Plot getPlot() {
		Plot tempPlot=this.plot;
		return tempPlot;
	}
} 





















