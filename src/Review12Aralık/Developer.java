package Review12Aralık;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }
    @Override
    public void work(){
        System.out.println(getName()+" is coding");
    }
    public void fixBugs(){
        System.out.println(getName()+" is crying about bug");
    }
}
