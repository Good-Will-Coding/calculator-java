
public class Calculator {
    private Reader reader;
    private int operations;

    public Calculator() {
        reader = new Reader();
        this.operations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("Value1: ");
        int value1 = reader.readerInteger();
        System.out.print("Value2: ");
        int value2 = reader.readerInteger();
        System.out.println("Sum of the values: " + (value1 + value2));
        operations++;
    }

    private void difference() {
        System.out.print("Value1: ");
        int value1 = reader.readerInteger();
        System.out.print("Value2: ");
        int value2 = reader.readerInteger();
        System.out.println("Difference of the values: " + (value1 - value2));
        operations++;
    }

    private void product() {
        System.out.print("Value1: ");
        int value1 = reader.readerInteger();
        System.out.print("Value2: ");
        int value2 = reader.readerInteger();
        System.out.println("Product of the values: " + (value1 * value2));
        operations++;
    }

    private void statistics() {
        System.out.println("Calculations done: " + operations);
    }
}
