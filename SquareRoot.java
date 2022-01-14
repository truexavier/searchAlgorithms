package searchAlgorithms;

public class SquareRoot {
    public static void main(String[] args) {
        //calculate the floor value square root of x
        int x = 25;
        Search sqroot = new Search();
        
        System.out.println("Sqrt(" + x + ") = " + sqroot.binarySearch(x));
    }
}
