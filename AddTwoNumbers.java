public class AddTwoNumbers {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
