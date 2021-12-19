package Review12Aralık;

public class SupportPersonel extends Employee{

    public SupportPersonel(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }
    @Override
    public void work(){
        System.out.println(getName()+" working very hard");
    }
}
