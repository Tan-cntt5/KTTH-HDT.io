package qlpm;
public class  MayTinhGiangVien extends MayTinh{
    private String phanMemGiangDay;
    private String tenGiangVien;

    public MayTinhGiangVien(String ten, String cpu, int ram) {
        super(ten, cpu, ram);
        this.phanMemGiangDay=phanMemGiangDay;
        this.tenGiangVien=tenGiangVien;
    }
 public String getphanMemGiangDay(){
     return phanMemGiangDay;
 }
 @Override
 public void kiemTraTrangThai(){
     super.kiemTraTrangThai();
    System.out.println("kiểm tra trạng thái máy tính giảng viên" + getTen());
 }
}
