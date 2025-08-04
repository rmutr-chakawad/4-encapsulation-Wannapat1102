public class Pizza01 {
    private static final int MAX_TOPPING = 10;
    private final String[] toppings;
    private int totalToppings;

    public Pizza01() {
        toppings = new String[MAX_TOPPING];
        totalToppings = 0;
    }

    public void addTopping(String topping) {
        if (totalToppings < MAX_TOPPING) {
            toppings[totalToppings] = topping;
            totalToppings++;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุงได้อีกแล้ว");
        }
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public int getPrice() {
        return 100 + (totalToppings * 10);
    }

    public void printAllTopping() {
        if (totalToppings == 0) {
            System.out.print("คุณไม่ได้ใส่เครื่องปรุง");
        } else {
            System.out.println("จำนวนเครื่องปรุงทั้งหมด");
            for (int i = 0; i < totalToppings; i++) {
                System.out.println("- " + toppings[i]);
            }
        }
    }
}

