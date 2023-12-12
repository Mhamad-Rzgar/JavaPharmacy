public class Capsule extends Medicine {

    private String capsuleType;
    private String capsuleSize;

    public Capsule(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description, String capsuleType, String capsuleSize) {
        super(name, type, price, quantity, expiryDate, manufacturer, description);
        this.capsuleType = capsuleType;
        this.capsuleSize = capsuleSize;
    }

    public Capsule(String type, String price, int quantity, String expiryDate, String manufacturer, String description,
            String capsuleType, String capsuleSize) {
        super(type, price, quantity, expiryDate, manufacturer, description);
        this.capsuleType = "capsule";
        this.capsuleType = capsuleType;
        this.capsuleSize = capsuleSize;
    }

    public Capsule() {
        super();
        this.capsuleType = "capsule";
        this.capsuleSize = "no size";
    }

    public String getCapsuleType() {
        return capsuleType;
    }

    public String getCapsuleSize() {
        return capsuleSize;
    }

    public void setCapsuleType(String capsuleType) {
        if (capsuleType.equals("Round") || capsuleType.equals("Oval") || capsuleType.equals("Square")
                || capsuleType.equals("Rectangle")) {
            this.capsuleType = capsuleType;
        } else {
            System.out.println("Invalid Capsule Type");
        }
    }

    public void setCapsuleSize(String capsuleSize) {
        if (capsuleSize.equals("Small") || capsuleSize.equals("Medium") || capsuleSize.equals("Large")) {
            this.capsuleSize = capsuleSize;
        } else {
            System.out.println("Invalid Capsule Size");
        }
    }

    public void printDetails() {
        print();
        System.out.println("Capsule Type: " + capsuleType);
        System.out.println("Capsule Size: " + capsuleSize);
    }

    // method overload
    public void printDetails(String name) {
        System.out.println("Name: " + name);
        print();
        System.out.println("Capsule Type: " + capsuleType);
        System.out.println("Capsule Size: " + capsuleSize);
    }
}