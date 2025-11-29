package multiple_bounds;

public class EmployeeProcessor<T extends Person & Payable & Reportable> {
    void process(T e) {
        System.out.println(e.name);
        e.paySalary();
        e.generateReport();
    }
}
