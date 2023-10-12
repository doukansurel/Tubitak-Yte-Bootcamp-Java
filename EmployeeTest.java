



        
public class EmployeeTest {

    public static void main(String[] args) {
        Employe employe = new Employe("Ali");
        Employe employe2 = new Employe("Mehmet");
        
        employe.setAge(25);
        employe.setSalary(8000);
        employe.setTitle("Engineer");
        employe.print();
        
        employe2.setAge(30);
        employe2.setSalary(18000);
        employe2.setTitle("Engineer");
        employe2.print();
    }
}
