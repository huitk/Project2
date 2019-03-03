public class TemperatureDriver {
	public static final int ARRAY_SIZE = 5; 
	public static void main(String[] args) {
		int x;
		double degree = 0;
		char scale = '\0';
		
	
		Temperature temp1 = new Temperature(100.0, 'C'); 
		Temperature temp2 = new Temperature(122, 'F'); 
		Temperature temp3 = new Temperature(32.0, 'F'); 
		Temperature temp4 = new Temperature(100.0, 'C'); 
		Temperature tempAve = new Temperature(50.0, 'C'); 
		
		
		System.out.println(temp2 + " to Celsius is " + temp2.toCelsius()); 
		System.out.println("Temp1 is " + temp1 + " to Kalvin is " + temp1.toKelvin());
		temp1 = temp1.toKelvin(); 
		System.out.println("Temp1 to Kelvin is " + temp1); 
		if (temp2.equals(tempAve)) {
			System.out.println("These two temperatures are equal");
		}
		else {
		
			System.out.println("These two temperature are not equal");
		}
		System.out.println("tempAve is " + tempAve); 
		System.out.println("temp1 is " + temp1); 
		System.out.println("temp2 is " + temp2); 
		System.out.println("temp3 is " + temp3); 
		System.out.println("temp4 is " + temp4);

		
		tempAve = tempAve.add(temp1);
		tempAve = tempAve.add(temp2);
		tempAve = tempAve.add(temp3);
		tempAve = tempAve.add(temp4);
		tempAve = tempAve.divide(5);
		
		System.out.println("The average temperature is " + tempAve); 
		temp2 = new Temperature(150.0, 'K');
		temp4 = new Temperature(100.0, 'C'); 
		System.out.print("Subtracting " + temp2 + " from " + temp4 +" gives ");
		temp4 = temp4.subtract(temp2); 
		System.out.println(temp4);
		
	}
}

