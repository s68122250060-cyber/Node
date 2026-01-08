public class TestArrayMethod {
    public static void main(String[] args) {
        int []t = new int[10];
        printArray(t);
        randomArray(t);
        printArray(t);
        int sum = sumArray(t);
        System.out.println("sum = "+sum);
   
    }
    public static void randomArray(int [] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(50+Math.random()*9);
        }
    }
    public static void printArray(int [] x) {
        for (int i : x) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static int sumArray(int [] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum+x[i];
        }
        return sum;
    }
}