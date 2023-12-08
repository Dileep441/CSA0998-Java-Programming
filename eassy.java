class MultiplicationTableThread extends Thread {
    private int number;

    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

 class MultiplicationTableApp {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Create threads for each multiplication table
        MultiplicationTableThread t1 = new MultiplicationTableThread(num1);
        MultiplicationTableThread t2 = new MultiplicationTableThread(num2);

        // Start the threads
        t1.start();
        t2.start();
    }
}
