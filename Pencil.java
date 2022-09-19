public class Pencil{
	private double length;
	private String color;
	private int type;
	private boolean mechanical;

	public Pencil(){
		length = 7.5;
		color = "yellow";
		type = 2;
		mechanical = false;
	}
	public Pencil(double theLength, String theColor){
		this();
		length = theLength;
		color = theColor;
		
	}
	public Pencil(double theLength, String theColor,int theType, boolean theMechanical){
		this();
		length = theLength;
		color = theColor;
		type = theType;
		mechanical = theMechanical;
	}

	public String getmechanical(){
		if(mechanical == false){
			return " Standard";
		}
		else{
			return " Mechanical ";
		}
	}

	public void sharpen(double minusLength){
		if (mechanical == true){
			System.out.println("unvalid... You Cannot Sharpen a Mechanical Pencil");
		} else{
		length -= minusLength;
		}
	}
	public void StandardTest(){
		if(type != 2 || mechanical == true){
			System.out.println("This pencil is not valid for a standardized test");
		}
		else{
			System.out.println("This pencil is valid for a standardized test");
		}
	}
	public void MechOrNot(){
		System.out.print("This pencils is ");
		if(mechanical == false){
			System.out.println("is not mechanical");
		}
		else{
			System.out.println("is mechanical");
		}
	}

	public String toString(){
		return "Your pencil is "+ color + ", type " + type + getmechanical()+ " pencil that is "+ length + " inches long.";
	}
}