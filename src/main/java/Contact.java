public class Contact {
    private String name;
    private String phone;
    private int age;
    private String email;

    public Contact(String craig_smith) {
    }


    String print(){

        return "Name: " + this.name + "  Phone:" +  phone + "  Age: " + age + "  Email: " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String summaryPrint(){
        return "Name: " + name + "  Phone:" +  phone + "  Age: " + age + "  Email: " + email;

    }
}
