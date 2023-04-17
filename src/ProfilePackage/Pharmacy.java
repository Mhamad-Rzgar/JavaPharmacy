
public class Pharmacy {

    private String name, address, phone, email, website, owner, manager, medicine;

    public Pharmacy(String name, String address, String phone, String email, String website, String owner,
            String manager,
            String medicine) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.owner = owner;
        this.manager = manager;
        this.medicine = medicine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public void printPharmacyInfo() {
        System.out.println("Pharmacy name: " + this.name);
        System.out.println("Pharmacy address: " + this.address);
        System.out.println("Pharmacy phone: " + this.phone);
        System.out.println("Pharmacy email: " + this.email);
        System.out.println("Pharmacy website: " + this.website);
        System.out.println("Pharmacy owner: " + this.owner);
        System.out.println("Pharmacy manager: " + this.manager);
        System.out.println("Pharmacy medicine: " + this.medicine);
    }

    // method overloading for above method

    public void printPharmacyInfo(String Casher) {
        // print cashier name
        System.out.println("Casher:" + Casher);
        System.out.println("Pharmacy name: " + name);
        System.out.println("Pharmacy address: " + address);
        System.out.println("Pharmacy phone: " + phone);
        System.out.println("Pharmacy email: " + email);
        System.out.println("Pharmacy website: " + website);
        System.out.println("Pharmacy owner: " + owner);
        System.out.println("Pharmacy manager: " + manager);
        System.out.println("Pharmacy medicine: " + medicine);
    }

    public void printPharmacyInfo(String name, String address, String phone, String email, String website, String owner,
            String manager,
            String medicine) {
        System.out.println("Pharmacy name: " + name);
        System.out.println("Pharmacy address: " + address);
        System.out.println("Pharmacy phone: " + phone);
        System.out.println("Pharmacy email: " + email);
        System.out.println("Pharmacy website: " + website);
        System.out.println("Pharmacy owner: " + owner);
        System.out.println("Pharmacy manager: " + manager);
        System.out.println("Pharmacy medicine: " + medicine);
    }

}
