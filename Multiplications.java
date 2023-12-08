class Multiplication extends Thread {
    private int number;

    public Multiplication(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

public class Multiplications {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;


        Multiplication obj1 = new Multiplication(num1);
        Multiplication obj2 = new Multiplication (num2);

        obj1.start();
        obj2.start();
    }
}