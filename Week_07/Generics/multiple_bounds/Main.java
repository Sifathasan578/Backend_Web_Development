package multiple_bounds;

public class Main {
    public static void main(String[] args) {
        EmployeeProcessor<Manager> processor = new EmployeeProcessor<>();
        processor.process(new Manager());
    }
}
