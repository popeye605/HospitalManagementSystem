public class Appointment {
    private Date d;
    private Patient p;
    private Doctor doc;
    Appointment(){
        d=new Date(12,2,2020);
        p=new Patient("xyxa","Ali",23,"corona");
        doc=new Doctor("surgeon");
    }
    Appointment(Date d1, Patient p1, Doctor doc1){
        d=d1;
        p=p1;
        doc=doc1;
    }

    public Date getD() {
        return d;
    }

    public Doctor getDoc() {
        return doc;
    }

    public Patient getP() {
        return p;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return doc+" "+p+" "+d;
    }
    public void display(){
        System.out.println(d.getDay()+d.getYear()+d.getMonth());
        System.out.println(doc.getSpecialization());
        System.out.println(p.getIllness());
    }
}