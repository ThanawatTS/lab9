

public enum Length {

	METER ("Meter", 1.0),
	FOOT("Foot",0.3048),
	MILE("Mile",1609.344),
	INCH("Inch",0.0254),
	KILOMETER("Kilometer",1000),
	WA("Wa",2),
	CENTIMETER("Centimeter",0.001),
	YARD("Yard",0.9144);
	public final String name;
	public final double value;
	Length(String name , double value){
	this.name =name;
	this.value = value;
	}
	public double getValue(){return value;}
	public String toString(){return name;}
}
