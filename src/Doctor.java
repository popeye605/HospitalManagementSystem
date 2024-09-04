public class Doctor {
    private String specialization;
    Doctor(){
        specialization="Surgon";
    }
    Doctor(String sepcialize){
        specialization=sepcialize;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialize) {
        this.specialization = specialize;
    }

    @Override
    public String toString() {
        return specialization;
    }
    public void display(){
        System.out.println(specialization);
    }
}