public class App {
    public static void main(String[] args){
        int [] array = null;
        int size = array==null ? 0:array.length;// avoiding the NPE(NullPointeExceptions)
        System.out.println(size); 
        int num = -2;
        int [] exception  = new int[num]; // this will cause NegativeArraySizeException

        int [] example = {1,2,3};
        int n = example[3]; // this will cause ArrayIndexOutOfBoundsException
        System.out.println(n);
        

    
    }
}
