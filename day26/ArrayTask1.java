package day26;

public class ArrayTask1 {
	public static void main(String[] args) {
		String str = "weight ";
		int[] weight = new int[3];
		
	     weight[0] = 63;
	     weight[1] = 71;
	     weight[2] = 59;
	     
	     
	     System.out.println(str+ weight[0]);
	     System.out.println(str+ weight[1]);
	     System.out.println(str+ weight[2]);
	     
	     weight[0] = weight[0] + weight[1] + weight[2];
	     System.out.println(str+" combind " +weight[0]);
	}

}
