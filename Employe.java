

public class Employe {
    private String name; 
    private int age;
    private String title;
    private int salary;

    public Employe(String name) {
        this.name = name;
      
    }

    public void print() {
        System.out.println(name + " " + age + " " + title + " " + salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
