package week1_chenluyi;

public class Practice3 {

	public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};

        int max = findMax(array);
        System.out.println("The maximum value in the array is: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}		
	



	
	