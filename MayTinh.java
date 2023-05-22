package qlpm;
class MayTinh{
    private String ten;
    private String cpu;
    private int ram;
    
    public MayTinh(String ten,String cpu,int ram){
        this.ten=ten;
        this.cpu = cpu;
        this. ram = ram;
    }
 public String getTen(){
     return ten;
 }
 public void setTen(String ten){
     this.ten=ten;
 }
 public String Cpu(){
     return cpu;
}
 public void setCpu(String cpu){
     this.cpu=cpu;
 }
 public int getRam(){
     return ram;
 }
 public void setRam(int ram){
     this.ram=ram;
 }
 public void kiemTraTrangThai(){
     System.out.println("kiem tra trang thai"+ten);
 }
}
