package ProfilePackage;

public class UserDetail {
    private String fullName;
    private String username;
    private String password;
    private String mobile;
    private String gender;
    private int age;
    

    public UserDetail(String fullName, String username, String password,String mobile, String gender, int age) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.mobile=  mobile;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public void printDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
        System.out.println("mobile: " + mobile);
        System.out.println("Age: " + age);
    }
}
