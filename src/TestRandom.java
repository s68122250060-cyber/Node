
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        int[] T = new int[10]; // สร้างอาเรย์ขนาด 10
        Random rand = new Random();
        int sum = 0;

        // สุ่มตัวเลขระหว่าง 50 ถึง 59
        for (int i = 0; i < T.length; i++) {
            T[i] = (int)(50+Math.random()*9); // สุ่ม 0-9 แล้วบวก 50
        }

        // แสดงค่าและหาผลรวม
        System.out.print("Numbers: ");
        for (int i : T) {
            System.out.print(i + " ");
            sum += i;
        }

        // คำนวณค่าเฉลี่ย
        double avg = (double) sum / T.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
    }
}
