public class TestArrayFor {
    public static void main(String[] args) {
        int []t = new int[10];
        for (int i : t) {
            System.out.print(i +" ");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] +" ");
        }
    }
}