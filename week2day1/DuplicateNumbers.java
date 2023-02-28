package week2.day1;


public class DuplicateNumbers {

	public static void main(String[] args) {
		int value[]= {2,5,3,1,4,5,7,6,3,2};
//		int value = value.lenght[];
		for (int i = 0; i < value.length-1; i++) {

			for (int j = i+1; j < value.length; j++) 
			{
			if (value[i]== value[j]) {
					System.out.println("The duplicate values are:"+ value[i]);
				}	
			}
		}
		}
}
			
//	Arrays.sort(value);
//	   for (int i = 0; i < value.length-1; i++) {
//		   if(value[i]==value[i+1]);
//		System.out.println("The duplicate values are:"+value[i]);
//	}
//			
//		}
//	}


