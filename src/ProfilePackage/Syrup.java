public class Syrup extends Medicine {
    private String syrupType, syrupSize, syrupFlavour, syrupColor;

    public Syrup(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description, String syrupType, String syrupSize, String syrupFlavour, String syrupColor) {
        super(name, type, price, quantity, expiryDate, manufacturer, description);
        this.syrupType = syrupType;
        this.syrupSize = syrupSize;
        this.syrupFlavour = syrupFlavour;
        this.syrupColor = syrupColor;
    }

    public Syrup(String type, String price, int quantity, String expiryDate, String manufacturer, String description,
            String syrupType, String syrupSize, String syrupFlavour, String syrupColor) {
        super(type, price, quantity, expiryDate, manufacturer, description);
        this.syrupType = "syrup";
        this.syrupType = syrupType;
        this.syrupSize = syrupSize;
        this.syrupFlavour = syrupFlavour;
        this.syrupColor = syrupColor;
    }

    public Syrup() {
        super();
        this.syrupType = "syrup";
        this.syrupSize = "small";
        this.syrupFlavour = "unknown";
        this.syrupColor = "unknown";
    }

    public String getSyrupType() {
        return syrupType;
    }

    public String getSyrupSize() {
        return syrupSize;
    }

    public String getSyrupFlavour() {
        return syrupFlavour;
    }

    public String getSyrupColor() {
        return syrupColor;
    }

    public void setSyrupType(String syrupType) {
        if (syrupType.equals("Liquid")) {
            this.syrupType = syrupType;
        } else {
            System.out.println("Invalid Syrup Type");
        }
    }

    public void setSyrupSize(String syrupSize) {
        if (syrupSize.equals("Small") || syrupSize.equals("Medium") || syrupSize.equals("Large")) {
            this.syrupSize = syrupSize;
        } else {
            System.out.println("Invalid Syrup Size");
        }
    }

    public void setSyrupFlavour(String syrupFlavour) {
        if (syrupFlavour.equals("Sweet") || syrupFlavour.equals("Sour") || syrupFlavour.equals("Bitter")
                || syrupFlavour.equals("Salty")) {
            this.syrupFlavour = syrupFlavour;
        } else {
            System.out.println("Invalid Syrup Flavour");
        }
    }

    public void setSyrupColor(String syrupColor) {
        if (syrupColor.equals("Red") || syrupColor.equals("Blue") || syrupColor.equals("Green")
                || syrupColor.equals("Yellow")) {
            this.syrupColor = syrupColor;
        } else {
            System.out.println("Invalid Syrup Color");
        }
    }

    public void printDetails() {
        print();
        System.out.println("Syrup Type: " + getSyrupType());
        System.out.println("Syrup Size: " + getSyrupSize());
        System.out.println("Syrup Flavour: " + getSyrupFlavour());
        System.out.println("Syrup Color: " + getSyrupColor());
    }

    // method overload
    public void printDetails(String name) {
        System.out.println("Name: " + name);
        print();
        System.out.println("Syrup Type: " + getSyrupType());
        System.out.println("Syrup Size: " + getSyrupSize());
        System.out.println("Syrup Flavour: " + getSyrupFlavour());
        System.out.println("Syrup Color: " + getSyrupColor());
    }

}
