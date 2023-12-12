public class Injection extends Medicine {

    private String injectionType, injectionSize, injectionColor, injectionSmell, injectionTaste, injectionTexture,
            injectionPainLevel, injectionPainDuration;

    // cnstractors

    public Injection(String name, String type, String price, int quantity, String expiryDate, String manufacturer,
            String description, String injectionType, String injectionSize, String injectionColor,
            String injectionSmell,
            String injectionTaste, String injectionTexture, String injectionPainLevel, String injectionPainDuration) {
        super(name, type, price, quantity, expiryDate, manufacturer, description);
        this.injectionType = injectionType;
        this.injectionSize = injectionSize;
        this.injectionColor = injectionColor;
        this.injectionSmell = injectionSmell;
        this.injectionTaste = injectionTaste;
        this.injectionTexture = injectionTexture;
        this.injectionPainLevel = injectionPainLevel;
        this.injectionPainDuration = injectionPainDuration;
    }

    public Injection(String price, int quantity, String expiryDate, String manufacturer,
            String description,
            String injectionType, String injectionSize, String injectionColor, String injectionSmell,
            String injectionTaste,
            String injectionTexture, String injectionPainLevel, String injectionPainDuration) {
        super("injection", price, quantity, expiryDate, manufacturer, description);
        this.injectionType = "injection";
        this.injectionType = injectionType;
        this.injectionSize = injectionSize;
        this.injectionColor = injectionColor;
        this.injectionSmell = injectionSmell;
        this.injectionTaste = injectionTaste;
        this.injectionTexture = injectionTexture;
        this.injectionPainLevel = injectionPainLevel;
        this.injectionPainDuration = injectionPainDuration;
    }

    public Injection() {
        super();
        this.injectionType = "injection";
        this.injectionSize = "no size";
        this.injectionColor = "no color";
        this.injectionSmell = "no smell";
        this.injectionTaste = "no taste";
        this.injectionTexture = "no texture";
        this.injectionPainLevel = "no pain level";
        this.injectionPainDuration = "no pain duration";
    }

    // getters

    public String getInjectionType() {
        return injectionType;
    }

    public String getInjectionSize() {
        return injectionSize;
    }

    public String getInjectionColor() {
        return injectionColor;
    }

    public String getInjectionSmell() {
        return injectionSmell;
    }

    public String getInjectionTaste() {
        return injectionTaste;
    }

    public String getInjectionTexture() {
        return injectionTexture;
    }

    public String getInjectionPainLevel() {
        return injectionPainLevel;
    }

    public String getInjectionPainDuration() {
        return injectionPainDuration;
    }

    // setters

    public void setInjectionType(String injectionType) {
        this.injectionType = injectionType;
    }

    public void setInjectionSize(String injectionSize) {
        this.injectionSize = injectionSize;
    }

    public void setInjectionColor(String injectionColor) {
        this.injectionColor = injectionColor;
    }

    public void setInjectionSmell(String injectionSmell) {
        this.injectionSmell = injectionSmell;
    }

    public void setInjectionTaste(String injectionTaste) {
        this.injectionTaste = injectionTaste;
    }

    public void setInjectionTexture(String injectionTexture) {
        this.injectionTexture = injectionTexture;
    }

    public void setInjectionPainLevel(String injectionPainLevel) {
        this.injectionPainLevel = injectionPainLevel;
    }

    public void setInjectionPainDuration(String injectionPainDuration) {
        this.injectionPainDuration = injectionPainDuration;
    }

    // print details

    public void printDetails() {
        print();
        System.out.println("Injection Type: " + injectionType);
        System.out.println("Injection Size: " + injectionSize);
        System.out.println("Injection Color: " + injectionColor);
        System.out.println("Injection Smell: " + injectionSmell);
        System.out.println("Injection Taste: " + injectionTaste);
        System.out.println("Injection Texture: " + injectionTexture);
        System.out.println("Injection Pain Level: " + injectionPainLevel);
        System.out.println("Injection Pain Duration: " + injectionPainDuration);
    }

    public void printDetails(String patientName) {
        print();
        System.out.println("patient name: " + patientName);
        System.out.println("Injection Type: " + injectionType);
        System.out.println("Injection Size: " + injectionSize);
        System.out.println("Injection Color: " + injectionColor);
        System.out.println("Injection Smell: " + injectionSmell);
        System.out.println("Injection Taste: " + injectionTaste);
        System.out.println("Injection Texture: " + injectionTexture);
        System.out.println("Injection Pain Level: " + injectionPainLevel);
        System.out.println("Injection Pain Duration: " + injectionPainDuration);
    }

}
