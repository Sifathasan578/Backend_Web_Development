package practice_coding_test;

public class Main {
    public static void main(String[] args) {
        SmartDevice phone = new Phone("Samsung", 60);
        SmartDevice laptop = new Laptop("Dell", 75);
        SmartDevice watch = new Smartwatch("Apple", 40);

        // Run time polymorphism
        SmartDevice[] devices = {phone, laptop, watch};
        for(SmartDevice device: devices) {
            device.powerOn(); // dynamic polymorphism
        }

        System.out.println("Phone's battery level is at " + phone.getBatteryLevel());
        System.out.println("Laptop's battery level is at " + laptop.getBatteryLevel());
        System.out.println("Smart watch's battery level is at " + watch.getBatteryLevel());

        // Method Overloading
        phone.charge(5);
        System.out.println("Phone's battery level at charging is " + phone.getBatteryLevel());

        phone.charge(5, true);
        System.out.println("Phone's battery level at fast charging is " + phone.getBatteryLevel());

        // Interface usage
        Portable.info();
        Phone phone1 = new Phone("Oppo", 45);
        phone1.carryAround();
        phone1.connectWiFi("HomeNetwork");
        System.out.println("Connected to the network: " + phone1.getNetworkName());
        phone1.disconnect();

        Laptop laptop1 = new Laptop("Asus", 95);
        laptop1.connectWiFi("Sifat332");
        System.out.println("Connected to the network: " + laptop1.getNetworkName());
        laptop1.disconnect();

        Smartwatch smartwatch = new Smartwatch("Haylou", 99);
        smartwatch.carryAround();
        smartwatch.trackSteps(500);


        SmartDevice device = new Phone("Apple", 60); // Upcasting
        ((Phone) device).makeCall("01819XXXXXX");
    }
}
package practice_coding_test;

public abstract class SmartDevice {
    private String brand;
    private int batteryLevel;

    public SmartDevice(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    abstract void powerOn(); // will be implemented later on child classes!

    void charge(int percent) {
        batteryLevel += percent;
    }

    void charge(int percent, boolean fastCharge) {
        if(fastCharge) {
            batteryLevel += (percent + 10); // how to show it increases faster? by adding +1 each time!
        }
        else {
            batteryLevel += percent;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
package practice_coding_test;

public interface Connectable {
    void connectWiFi(String networkName);

    default void disconnect() { // if I didn't use default by default it shouldn't be default right?
        System.out.println("Disconnected from network");
    }
}
package practice_coding_test;

public interface Portable {
    void carryAround();

    static void info() {
        System.out.println("Portable devices are easy to carry");
    }
}
package practice_coding_test;

public class Phone extends SmartDevice implements Connectable, Portable {
    private String networkName;

    public Phone(String brand, int batteryLevel) {
        super(brand, batteryLevel);
    }

    @Override
    void powerOn() {
        System.out.println("Phone is starting up...");
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("Connecting to WiFi network: " + networkName);
        this.networkName = networkName;
    }

    @Override
    public void carryAround() {
        System.out.println("Carrying phone around easily.");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " right now!");
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getBatteryLevel() {
        return super.getBatteryLevel();
    }

    public String getNetworkName() {
        return this.networkName;
    }
}
package practice_coding_test;

public class Laptop extends SmartDevice implements Connectable{
    private String networkName;

    public Laptop(String brand, int batteryLevel) {
        super(brand, batteryLevel);
    }

    @Override
    void powerOn() {
        System.out.println("Laptop booting...");
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("Connecting to WiFi network: " + networkName);
        this.networkName = networkName;
    }

    public void code() {
        System.out.println("Coding in java");
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getBatteryLevel() {
        return super.getBatteryLevel();
    }

    public String getNetworkName() {
        return networkName;
    }
}
package practice_coding_test;

public class Smartwatch extends SmartDevice implements Portable {
    public Smartwatch(String brand, int batteryLevel) {
        super(brand, batteryLevel);
    }

    @Override
    void powerOn() {
        System.out.println("Smartwatch activated.");
    }

    @Override
    public void carryAround() {
        System.out.println("Carrying smart watch around easily.");
    }

    public void trackSteps(int steps) {
        System.out.println("Tracking " + steps + " steps!");
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getBatteryLevel() {
        return super.getBatteryLevel();
    }
}
