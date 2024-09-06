// inherritance
class Persons{
    private String name;
    private int age;
    private String adress;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
class Stdnt extends Persons{
    private String branch;
    private String college;


    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    public String toString(){
        return "Student : Name :"+getName() +" Age : "+getAge() +" Adress : "+getAdress() +" College :"+college+" branch"+branch;
    }
    
}
class Employee extends Persons{
    private String eid;
    private String department;


    public String getEid() {
        return eid;
    }
    public void setEid(String eid) {
        this.eid = eid;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return "Eployee : "+" Name: "+getName()+" Age : "+getAge() +" Adress : "+getAdress()+" Eid : "+eid+" Department :"+department;
    }
    
}
public class Prtc3 {
    public static void main(String[] args) {
        Employee employee =new Employee();
        Stdnt student =new Stdnt();
        employee.setName("faizan");
        employee.setAge(21);
        employee.setAdress("mastpora");
        employee.setEid("1234");
        employee.setDepartment("engineer");

        student.setName("Imran");
        student.setAge(21);
        student.setAdress("baramulla");
        student.setCollege("SSM");
        student.setBranch("CSE");
        
        
        System.out.println(employee);
        System.out.println(student);

       
    }
}
