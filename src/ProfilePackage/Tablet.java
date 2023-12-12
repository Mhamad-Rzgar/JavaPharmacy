public class Tablet extends Medicine {
    private String tabletType;
    private String tabletSize;

    public Tablet(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description, String tabletType, String tabletSize) {
        super(name, type, price, quantity, expiryDate, manufacturer, description);
        this.tabletType = tabletType;
        this.tabletSize = tabletSize;
    }

    public Tablet(String type, String price, int quantity, String expiryDate, String manufacturer, String description,
            String tabletType, String tabletSize) {
        super(type, price, quantity, expiryDate, manufacturer, description);
        this.tabletType = "tablet";
        this.tabletType = tabletType;
        this.tabletSize = tabletSize;
    }

    public Tablet() {
        super();
        this.tabletType = "tablet";
        this.tabletSize = "no size";
    }

    public String getTabletType() {
        return tabletType;
    }

    public String getTabletSize() {
        return tabletSize;
    }

    public void setTabletType(String tabletType) {
        if (tabletType.equals("Round") || tabletType.equals("Oval") || tabletType.equals("Square")
                || tabletType.equals("Rectangle")) {
            this.tabletType = tabletType;
        } else {
            System.err.println("Invalid Tablet Type");
        }
    }

    public void setTabletSize(String tabletSize) {
        if (tabletSize.equals("Small") || tabletSize.equals("Medium") || tabletSize.equals("Large")) {
            this.tabletSize = tabletSize;
        } else {
            System.out.println("Invalid Tablet Size");
        }
    }

    public void printDetails() {
        print();
        System.out.println("Tablet Type: " + tabletType);
        System.out.println("Tablet Size: " + tabletSize);
    }
}
