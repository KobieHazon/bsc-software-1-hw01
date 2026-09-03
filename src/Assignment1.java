public class Assignment1 {
     public static void main(String[] args) {
    	 	int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (x < 0 || y < 0 || z < 0) {
        		System.out.println("Invalid input!");
        }
        else {
        		if (x*x + y*y == z*z) {
        			System.out.println(String.format("The input (%s,%s,%s) defines a valid triangle!", x, y, z));
        		}
        		else {
        			System.out.println(String.format("The input (%s,%s,%s) does not define a valid triangle!", x, y, z));
        		}
        }
     }		     
}		