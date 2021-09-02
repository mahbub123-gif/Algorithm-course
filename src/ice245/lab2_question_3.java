package ice245;
import java.util.*;

public class lab2_question_3 {

	public static void isDistinctArray(Integer [] arrA){
        Set set = new HashSet(Arrays.asList(arrA));
        
        if(arrA.length==set.size())
        {
            System.out.println("Given array has all unique or distinct elements " + Arrays.toString(arrA));
        }
        else
        {
            System.out.println("Given array does not contains all unique elements, and contains duplicate elements " + Arrays.toString(arrA));
        }
    }

    public static void main(String[] args) {
        Integer [] arrA = { 1,2,3,6,4,9,8};
        isDistinctArray(arrA);
       
    }
}
