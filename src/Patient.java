import java.io.*;
import java.util.ArrayList;

public class Patient extends Person {
    private String illness;

    Patient() {
        super();
        illness = "corona";
    }

    Patient(String id, String n, int A, String ill) {
        super(id, n, A);
        illness = ill;
    }

    public void setIllness(String ill) {
        illness = ill;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return illness;
    }

    public void display() {
        System.out.println(illness);
    }


    public void writeToFile(Patient e) {
        try {
            File f = new File("test.ser");
            ObjectOutputStream oos;
            if (f.exists())
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));

            }
            oos.writeObject(e);
            oos.close();
        } catch (IOException h) {
            System.out.println("Error in File Writing");
        }
    }

    public static ArrayList<Patient> readFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
            while (true) {
                Patient e = (Patient) ois.readObject();
                System.out.println(e.name);
            }
        }
        catch(ClassNotFoundException x)
            { }
        catch(EOFException x){
            return null;
            }
        catch(IOException x)
            {
            }
        return null;
    }

    public static void deletePatientFromFile(int ID) throws Exception{
        ArrayList<Patient> List=readFromFile( );
        for(int i=0; i<List.size();i++)
        {
            if(List.get(i).getId().equals(ID))
            {
                List.remove(i);break;


            }
            try {
                File f = new File("test.ser");
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                for (int y= 0; i < List.size(); i++) {
                    oos.writeObject(List.get(i));
                }
                public static void updateIllnessOfPatient(int Id,String Illness)
                {
                    ArrayList<Patient>List=readFromFile();
                    for(if(List.get(i);getID():=ID))
                }
            }
            catch(IOException e){
                System.out.println("Error in Writing");}

            }
        }

    }

