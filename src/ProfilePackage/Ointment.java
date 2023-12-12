
public class Ointment extends Medicine {

    private String ointmentType, ointmentSize, ointmentColor, ointmentSmell, ointmentTaste, ointmentTexture;

    public Ointment(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description, String ointmentType, String ointmentSize, String ointmentColor, String ointmentSmell,
            String ointmentTaste, String ointmentTexture) {
        super(name, type, price, quantity, expiryDate, manufacturer, description);
        this.ointmentType = ointmentType;
        this.ointmentSize = ointmentSize;
        this.ointmentColor = ointmentColor;
        this.ointmentSmell = ointmentSmell;
        this.ointmentTaste = ointmentTaste;
        this.ointmentTexture = ointmentTexture;
    }

    public Ointment(String type, String price, int quantity, String expiryDate, String manufacturer, String description,
            String ointmentType, String ointmentSize, String ointmentColor, String ointmentSmell, String ointmentTaste,
            String ointmentTexture) {
        super("ointment", price, quantity, expiryDate, manufacturer, description);
        this.ointmentType = "ointment";
        this.ointmentType = ointmentType;
        this.ointmentSize = ointmentSize;
        this.ointmentColor = ointmentColor;
        this.ointmentSmell = ointmentSmell;
        this.ointmentTaste = ointmentTaste;
        this.ointmentTexture = ointmentTexture;
    }

    public Ointment() {
        super();
        this.ointmentType = "ointment";
        this.ointmentSize = "small";
        this.ointmentColor = "unknown";
        this.ointmentSmell = "smells like medicine";
        this.ointmentTaste = "tastes like medicine";
        this.ointmentTexture = "unknown";
    }

    public String getOintmentType() {
        return ointmentType;
    }

    public String getOintmentSize() {
        return ointmentSize;
    }

    public String getOintmentColor() {
        return ointmentColor;
    }

    public String getOintmentSmell() {
        return ointmentSmell;
    }

    public String getOintmentTaste() {
        return ointmentTaste;
    }

    public String getOintmentTexture() {
        return ointmentTexture;
    }

    public void setOintmentType(String ointmentType) {
        if (ointmentType == null || ointmentType.isEmpty()) {
            System.out.println("Ointment Type is empty or null");
        } else {
            this.ointmentType = ointmentType;
        }
    }

    public void setOintmentSize(String ointmentSize) {
        if (ointmentSize == null || ointmentSize.isEmpty()) {
            System.out.println("Ointment Size is empty or null");
        } else {
            this.ointmentSize = ointmentSize;
        }
    }

    public void setOintmentColor(String ointmentColor) {
        if (ointmentColor == null || ointmentColor.isEmpty()) {
            System.out.println("Ointment Color is empty or null");
        } else {
            this.ointmentColor = ointmentColor;
        }
    }

    public void setOintmentSmell(String ointmentSmell) {
        if (ointmentSmell == null || ointmentSmell.isEmpty()) {
            System.out.println("Ointment Smell is empty or null");
        } else {
            this.ointmentSmell = ointmentSmell;
        }
    }

    public void setOintmentTaste(String ointmentTaste) {
        if (ointmentTaste == null || ointmentTaste.isEmpty()) {
            System.out.println("Ointment Taste is empty or null");
        } else {
            this.ointmentTaste = ointmentTaste;
        }
    }

    public void setOintmentTexture(String ointmentTexture) {
        if (ointmentTexture == null || ointmentTexture.isEmpty()) {
            System.out.println("Ointment Texture is empty or null");
        } else {
            this.ointmentTexture = ointmentTexture;
        }
    }

    public void printDetails() {
        print();
        System.out.println("Ointment Type: " + ointmentType);
        System.out.println("Ointment Size: " + ointmentSize);
        System.out.println("Ointment Color: " + ointmentColor);
        System.out.println("Ointment Smell: " + ointmentSmell);
        System.out.println("Ointment Taste: " + ointmentTaste);
        System.out.println("Ointment Texture: " + ointmentTexture);
    }

    // method overload
    public void printDetails(String shopName) {
        System.out.println("Shop Name: " + shopName);
        print();
        System.out.println("Ointment Type: " + ointmentType);
        System.out.println("Ointment Size: " + ointmentSize);
        System.out.println("Ointment Color: " + ointmentColor);
        System.out.println("Ointment Smell: " + ointmentSmell);
        System.out.println("Ointment Taste: " + ointmentTaste);
        System.out.println("Ointment Texture: " + ointmentTexture);
    }

}
