public class Patientrunner {
    public static void main(String[] args) {


        Patient p1 = new Patient("xxyz", "Ansaar", 21, "corona");
        p1.writeToFile(p1);
        Patient p2 = new Patient("xxy", "Ahmed", 20, "fever");
        p1.writeToFile(p1);
        Patient p3 = new Patient("xxzz", "yasir", 18, "chicken pox");
        p1.writeToFile(p1);
    }
}

