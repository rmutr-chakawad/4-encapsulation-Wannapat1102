import java.util.Scanner;

public class Pizza02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza01 myPizza = new Pizza01();

        System.out.print("1 เครื่องปรุง เพิ่ม 10 บาท (สูงสุดอยู่ที่ 10 อย่าง) : ");
        int n = scanner.nextInt();
        scanner.nextLine(); // เคลียร์บรรทัด

        if (n > 10) {
            System.out.println("ใส่ได้แค่ 10 อย่าง ");
            n = 10;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("เครื่องปรุงที่ " + (i + 1) + " > ");
            String topping = scanner.nextLine();
            myPizza.addTopping(topping);
        }

        System.out.println("\n=== พิซซ่าของคุณ ===");
        System.out.println("ใช้เครื่องปรุงไปทั้งหมด " + myPizza.getTotalToppings()+" อย่าง");
        myPizza.printAllTopping();
        System.out.println("ราคาพิซซ่า เป็นจำนวนเงินทั้งหมด " + myPizza.getPrice() + " บาท");

        scanner.close();
    }
}
