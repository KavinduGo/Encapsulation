public class paySheet {
    private int emp_No;private String email;private float sallary;private long acc_No;
    public int getEmp_No() {return emp_No;}public float getSallary() {return sallary;}
    public String getEmail() {return email;}public long getAcc_No() {return acc_No;}
    public void setEmp_No(int emp_No) {this.emp_No = emp_No;}
    public void setSallary(float sallary) {this.sallary = sallary;}
    public void setEmail(String email) {this.email = email;}
    public void setAcc_No(long acc_No) {this.acc_No = acc_No;}}
class runTest {
    public static void main(String[] args) {
        paySheet ps = new paySheet();
        ps.setEmp_No(8120641);
        ps.setEmail("kavindugodakanda2002@gmail.com");
        ps.setSallary(200000F);
        ps.setAcc_No(123456789987654321L);
        System.out.println("Employee Number is "+ ps.getEmp_No());
        System.out.println("Employee Email is "+ps.getEmail());
        System.out.println("Employee Sallary is "+ps.getSallary());
        System.out.println("Employee Account Number is "+ps.getAcc_No());}}
