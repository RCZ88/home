package tester;

public class numtenE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Name = {"Annie", "Boris", "Hugh", "Paul", "Robby", "Zara" };
		double [] Weight  = {52.40, 100.00, 105.00, 61.00, 88.0, 68.0};
		double [] Height = {1.56, 2.00, 2.03, 1.75, 1.80, 1.71};
		double [] BMI = {0,0,0,0,0,0};
		
		int i = 0; 
		double sumBMI = 0;
		for( i =0; i < Name.length; i++) {
			BMI[i] = Weight[i]/(Height[i]*Height[i]);
		}
		for (i = 0; i< Name.length; i++) {
			sumBMI = sumBMI + BMI[i];
		}
		double avgBMI = sumBMI/Name.length;
		System.out.println("Average BMI = "+ avgBMI);
		System.out.println("People who are above average are: ");
		for( i =0; i < Name.length; i++) {
			if (Weight[i]/(Height[i]*Height[i]) > avgBMI) {
				System.out.println("- "+Name[i] + " = "+BMI[i]);
			}
		}
	}

}
