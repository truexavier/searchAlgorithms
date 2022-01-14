package searchAlgorithms;

public class Search {

    public int binarySearch(int x){
        if (x == 0){
            return 0;
        }

        int start = 1, end = x, result = -1;

        //checks from 1 to x for square root
        while(start <= end){
            int mid = start + (end - start)/2;
            //checks to see if root has been found.  If value is less than 
            //it tries values one higher 
            if(mid <= x/mid){
                result = mid;
                start = mid + 1;
            }
            //if value is greater, it tries value 1 less.
            else{
                end = mid - 1;
            }
        }
        //result is mid value that is floor value of square x
        return result;
    }
}
