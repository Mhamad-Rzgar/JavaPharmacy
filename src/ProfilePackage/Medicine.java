public class Medicine {

    protected String name;
    protected String type;
    protected String price;
    protected int quantity;
    protected String expiryDate;
    protected String manufacturer;
    protected String description;

    public Medicine(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public Medicine(String type, String price, int quantity, String expiryDate, String manufacturer,
            String description) {
        this.name = "default name";
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public Medicine() {
        this.name = "Paracetamol";
        this.type = "Tablet";
        this.price = "10";
        this.quantity = 100;
        this.expiryDate = "2021-12-31";
        this.manufacturer = "Pfizer";
        this.description = "Paracetamol is a painkiller";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name is empty or null");
        } else {
            this.name = name;
        }
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("Type is empty or null");
        } else if (type instanceof String) {
            this.type = type;
        } else {
            System.out.println("Type is not String");
        }
    }

    public void setPrice(String price) {
        if (price == null || price.isEmpty()) {
            System.out.println("Price is empty or null");
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity == 0) {
            System.out.println("Quantity is empty or null");
        } else if (quantity < 0) {
            System.out.println("Quantity is negative");
        } else {
            System.out.println("Quantity is not Integer");
        }
    }

    public void setExpiryDate(String expiryDate) {
        if (expiryDate == null || expiryDate.isEmpty()) {
            System.out.println("ExpiryDate is empty or null");
        } else {
            this.expiryDate = expiryDate;
        }
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.isEmpty()) {
            System.out.println("Manufacturer is empty or null");
        } else {
            this.manufacturer = manufacturer;
        }
    }

    public void setDescription(String description) {
        if (description == null || description.isEmpty()) {
            System.out.println("Description is empty or null");
        } else {
            this.description = description;
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Description: " + description);
    }

    // method overloaded
    public void print(String name) {
        System.out.println("Name of this medicine is: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Description: " + description);
    }
}
