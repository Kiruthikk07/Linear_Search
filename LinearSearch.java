import java.util.Scanner;
public class LinearSearch{
    public static int linearSearch(int[]arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[]arr = {10,30,20,50,40};
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		int pos = linearSearch(arr, element);
		if(pos != -1){
		    System.out.println("The element is found at position " + pos);
		}
		else{
		    System.out.println("The element is not found");
		}
	}
}
