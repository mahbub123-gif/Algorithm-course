package ice245;

public class lab2_question_4 {
	static void printDistinct(int arr[], int n)
    {
		for (int i = 0; i < arr.length-1; i++) {
	        for (int j = i+1; j < arr.length; j++) {
	             if (arr[i] == arr[j]) {
	                 System.out.println("the array is not distinct.");
	                 return;
	             }
	        }
	        
	    }         
		System.out.println("the array is distinct.");
       
	             
	}
        

    
     
   
    public static void main (String[] args)
    {
        int arr[] = {6,2,1,7};
        int n = arr.length;
        printDistinct(arr, n);
 
    }
}
