public class Person{
    private String Id;
    public String name;
    private int age;

    Person() {
        Id = "xxyy";
        name = "Ahsan";
        age = 12;
    }

    Person(String id, String n, int a) {
        Id = id;
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+Id;
    }
    public void display(){
        System.out.println(name);
        System.out.println(Id);
        System.out.println(age);
    }
}
