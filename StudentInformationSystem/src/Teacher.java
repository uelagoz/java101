public class Teacher {
    String name;
    String branch;
    String mobilePhoneNumber;

    Teacher(String name, String branch, String mobilePhoneNumber) {
        this.name = name;
        this.branch = branch;
        this.mobilePhoneNumber = mobilePhoneNumber;

    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: " + this.branch);
        System.out.println("Telefon: " + this.mobilePhoneNumber);
    }
}
