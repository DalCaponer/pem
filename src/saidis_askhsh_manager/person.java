package saidis_askhsh_manager;

public class person {

    private String name;
    private String Lastname;
    private int age;

    public person ( String name , String Lastname , int age ) {
        this.name = name;
        this.Lastname = Lastname;
        this.age = age;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "person{" + "name=" + name + ", Lastname=" + Lastname + ", age=" + age + '}';
    }

    public void setLastname ( String Lastname ) {
        this.Lastname = Lastname;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public String getLastname () {
        return Lastname;
    }

    public int getAge () {
        return age;
    }

}

class employee extends person {

    private double salary;
    private int yearBirth;

    @Override
    public String toString () {
        return "employee{" + "salary=" + salary + ", yearBirth=" + yearBirth + '}';
    }

    public void setSalary ( double salary ) {
        this.salary = salary;
    }

    public void setYearBirth ( int yearBirth ) {
        this.yearBirth = yearBirth;
    }

    public double getSalary () {
        return salary;
    }

    public int getYearBirth () {
        return yearBirth;
    }

    public employee ( String name , String Lastname , int age ) {
        super ( name , Lastname , age );
    }
}

class manager extends employee {

    public void setBonus ( double bonus ) {
        this.bonus = bonus;
    }

    public double getBonus () {
        return bonus;
    }
    private double bonus;

    public manager ( String name , String Lastname , int age ) {
        super ( name , Lastname , age );
    }

    @Override
    public String toString () {
        return "manager{" + "bonus=" + bonus + '}';
    }
}
