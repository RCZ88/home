package projectEuler;

public class CountingSundays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int[]dim = {31,28,31,30,31,30,31,31,30,31,30,31};
		int count = 0;
		int lastDayIndex = 365%7; //-1+1 (-1 because index starts from 0 and +1 because the index is the last day of december)
		for(int i = 1901; i<= 2000; i++) {
			if(i%4 == 0) {
				dim[1] = 29;
			}else {
				dim[1] = 28;
			}
			for(int j = 0; j<12; j++) {
				int index = 0;
				for(int k = 0; k<dim[j]; k++) {
					index = (lastDayIndex+k)%7;
					String day = days[index];
					if(k == 0 && day.equals("Sunday")) {
						count++;
					}
				}
				lastDayIndex = index+1;
			}
		}
		System.out.println(count);
	}

}
