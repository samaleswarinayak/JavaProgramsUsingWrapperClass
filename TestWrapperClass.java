/*Wrapper class Example*/

class TestWrapperClass
{
	public static void main(String args[])
	{
		byte bvalue = 25;
		short svalue = 35;
		int ivalue = 125;
		long lvalue = 568;
		float fvalue = 50.65f;
		double dvalue = 36.547;
		
		//Convert from primitive to Objects
		Byte bob = bvalue;
		Short sob = svalue;
		Integer iob = ivalue;
		Long lob = lvalue;
		Float fob = fvalue;
		Double dob = dvalue;
		//Display the details
		System.out.println("Byte value "+bob);
		System.out.println("Short value "+sob);
		System.out.println("Integer value "+iob);
		System.out.println("Float value "+fob);
		System.out.println("Double value "+dob);
		
		//Unboxing 
		
	}
}