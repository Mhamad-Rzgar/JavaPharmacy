package Models;

public class ItemsModel {

    private String commercialName;
    private String ScinteficName;
    private String barcode;
    private String brand;
    private String type;
    private String unit;

    public ItemsModel(String commercialName, String ScinteficName, String barcode, String brand, String type, String unit) throws Exception {
        
            if (commercialName.isEmpty()) {
                throw new Exception("commercialName Required");
            }
            if (ScinteficName.isEmpty()) {
                throw new Exception("ScinteficName Required");
            }
            if (barcode.isEmpty()) {
                throw new Exception("barcode Required");
            }
            if (brand.isEmpty()) {
                throw new Exception("brand Required");
            }
            if (type.isEmpty()) {
                throw new Exception("item type Required");
            }
            if (unit == null || unit.isEmpty()) {
                throw new Exception("unit Required");
            }
            this.commercialName = commercialName;
            this.ScinteficName = ScinteficName;
            this.barcode = barcode;
            this.brand = brand;
            this.type = type;
            this.unit = unit;
        
    }

    

    public void setCommercialName(String commercialName) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("commercialName Required");
        }

        this.commercialName = commercialName;
    }

    public void setScinteficName(String ScinteficName) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("commercialName Required");
        }

        this.ScinteficName = ScinteficName;
    }

    public void setBarcode(String barcode) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("barcode Required");
        }

        this.barcode = barcode;
    }

    public void setBrand(String brand) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("brand Required");
        }

        this.brand = brand;
    }

    public void setType(String type) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("item type Required");
        }
        this.type = type;
    }

    public void setUnit(String Unit) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("unit Required");
        }
        this.unit = Unit;
    }

    public String getScinteficName() {
        return ScinteficName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public String getStrData() {
        return """
               The Data Your enterd Successflully is:
               Commercial Name: """ + commercialName
                + "\nScientific Name: " + ScinteficName
                + "\nBarcode Data: " + barcode
                + "\nBrand name: " + brand
                + "\nType: " + type
                + "\nUnit: " + unit;
    }

}
