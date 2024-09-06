// object composation
class Customer{
    private String name;
    private Adress homeAdress;
    private Adress workAdress;
    public Customer(String name, Adress homeAdress) {
        this.name=name;
        this.homeAdress=homeAdress;

    }
    public String toString(){
        return String.format("name - %s\n homeAdress -%s  \n workAdress -%s", name,homeAdress,workAdress);
    }
    public Adress getHomeAdress() {
        return homeAdress;
    }
    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }
    public Adress getWorkAdress() {
        return workAdress;
    }
    public void setWorkAdress(Adress workAdress) {
        this.workAdress = workAdress;
    }
    
}
class Adress{
    private String city;
    private String town;
    private String pincode;
    public Adress(String city, String town, String pincode) {
        this.city = city;
        this.town = town;
        this.pincode = pincode;
    }
    public String toString(){
        return String.format("city =%s, town =%s , pincode= %s", city,town,pincode);
    }

}
public class prtc10 {
    public static void main(String[] args) {
        Adress homeAdress=new Adress("srinagar", "Nowgam", "190015");
        Adress workAdress=new Adress("shopian", "mastpora", "192303");
        Customer faizan =new Customer("Faizan",homeAdress);
        faizan.setWorkAdress(workAdress);
        System.out.println(faizan);
    }
}
