package tema3boletin2ejercicio03;

import java.util.Arrays; 

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
	    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	        
	    // Insert an element in 3rd position of the array (index->2, value->5)
	        
	    int Index_position = 2;
	    int newValue = 5;
	        
	    System.out.println("Original Array : "+Arrays.toString(my_array));     
	        
	    for(int i = my_array.length-1; i >= Index_position; i--){ /*Otra forma: for(int i=0;i >= Index_position;i++){*/
	        my_array[i] = my_array[i-1];
	    }
	    my_array[Index_position-1] = newValue;
	    System.out.println("New Array: "+Arrays.toString(my_array));
	    
	}
}
