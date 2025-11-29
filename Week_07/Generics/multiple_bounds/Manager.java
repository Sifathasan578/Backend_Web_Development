package multiple_bounds;

public class Manager extends Person implements Payable, Reportable {

    @Override
    public void paySalary() {
        System.out.println("Salary paid");
    }

    @Override
    public void generateReport() {
        System.out.println("Report generated");
    }
}
