import java.util.Scanner;

public class Temperature {
	
	
	//holds number of degrees
	
	private double degree;
	
	//holds 'c' or 'f'
	private char scale;
	
	public Temperature(double degree, char scale) {
		set(degree, scale);
		
		
	}
	
	private void set(double degree, char scale) {
		
		switch(scale) {
		case 'K' :
		case 'k' :
			if(this.degree < 0) {
				System.out.println("Kelvin cannot be less than zero");
				System.exit(0);
			}
			else {
				this.degree = degree;
				this.scale = scale;
			}
		case 'F' :	
		case 'f' :
			if(this.degree < -459.67) {
				System.out.println("Fahrenheir cannot be less than -459.67");
				System.exit(0);
			}
			else {
				this.degree = degree;
				this.scale = scale;
			}
		case 'C' :
		case 'c' :
			if(this.degree < -273.15) {
				System.out.println("Celsius cannot be less than -273.15");
				System.exit(0);
			}
			else {
				this.degree = degree;
				this.scale = scale;
			}
		}
	}
	
	public Temperature toCelsius() {
		
		double degreePart = 0;
		
		switch (this.scale) {
		
		case 'F':
			degreePart = (this.degree - 32) * 5.0 / 9;
			break;
		
			
		case 'K':
			degreePart = this.degree - 273.15;
			break;
			
		case 'C':
			degreePart = this.degree;
			break;
			
		}
        Temperature answer = new Temperature(degreePart, 'C');	
        return answer;	
}		
				
	public Temperature toFahrenheit() {
		
		double degreePart = 0;
		
		switch (this.scale) {
		
		case 'F':
			degreePart = this.degree;
			break;
		
			
		case 'K':
			degreePart = (this.degree * 9.0/5) - 459.67 ;
			break;
			
		case 'C':
			degreePart = (this.degree * 9.0/5) + 32;
			break;
			
		}
        Temperature answer = new Temperature(degreePart, 'F');	
        return answer;	
}						
			
	public Temperature toKelvin() {
		
		double degreePart = 0;
		
		switch (this.scale) {
		
		case 'F':
			degreePart = (this.degree + 459.67) * 5.0 / 9;
			break;
		
			
		case 'K':
			degreePart = this.degree;
			break;
			
		case 'C':
			degreePart = this.degree + 273.15;
			break;
			
		}
        Temperature answer = new Temperature(degreePart, 'K');	
        return answer;	
}			
	
	public Boolean equals(Temperature a) {
			
		if (this.scale == 'F') {
			a = a.toFahrenheit();
		}
		if(this.scale == 'C') {
			a = a.toCelsius();
		}	
		
		Boolean isequal;
		if(this.degree == a.degree) {
			isequal = true;
		}
		else {
			isequal = false;
		}
		return isequal;
	}
	
	public Temperature subtract(Temperature a) {
		Temperature substract = new Temperature(a.degree, a.scale);
		
		switch(this.scale) {
			case 'K' :
			substract = a.toKelvin();
			break;
		
			case 'C':
			substract = a.toCelsius();
			break;
		}
		substract.degree = this.degree - substract.degree;
		return substract;
	}
	
	public String toString() {
		return this.degree + " " + scale;
	}

	public Temperature add(Temperature a) {
        Temperature add = new Temperature(a.degree,a.scale);	
		switch(this.scale) {
		case 'F':
			add = a.toFahrenheit();
			break;
		
		case 'K':
			add = a.toKelvin();
			break;
			
		case 'C':
			add = a.toCelsius();
			break;
			
		}	
		add.degree = this.degree + add.degree;
        return add;
	}
		
	public Temperature divide(double a) {
		Temperature aDivide = new Temperature(this.degree,this.scale);
		aDivide.degree = this.degree / a;
		return aDivide;
		
	}
	public void read() {
		Scanner keyboard = new Scanner(System.in);
	}
}

	
	