package Review12Aralık;

public class Tester extends Employee{


    public Tester(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }
    @Override
    public void work(){
        System.out.println(getName()+" is name");
    }
    public void findBugs(){

    }
}
