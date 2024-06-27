package array;

public class Reverse_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String org = "Divs Divvi";
//Cja
//	
		String input = "154254789"
				+ "";
		 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.println(try1[i]);	
		
//		int[] numbers = {5, 8, 2, 10, 7, 1};
//
//        int secondLargest = findSecondLargest(numbers);
//
//        System.out.println("The second-largest number is: " + secondLargest);
//    }

//    private static int findSecondLargest(int[] arr) {
//        int firstLargest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        // Traverse the array to find the two largest numbers
//        for (int num : arr) {
//            if (num > firstLargest) {
//                secondLargest = firstLargest;
//                firstLargest = num;
//            } else if (num > secondLargest && num != firstLargest) {
//                secondLargest = num;
//            }
//        }
//
//        return secondLargest;
//    }







	}

}
