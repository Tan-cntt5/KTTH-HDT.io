package qlpm;
public class MayTinhSinhVien extends MayTinh{
    private String heDieuHanh;
public MayTinhSinhVien(String ten, String cpu, int ram, String heDieuHanh){
    super(ten, cpu, ram);
    this.heDieuHanh=heDieuHanh;
}
public String getheDieuhanh(){
    return heDieuHanh;
    }
@Override
public void kiemTraTrangThai(){
    super.kiemTraTrangThai();
    System.out.println("kiểm tra trạng thái máy tính sinh viên" + getTen());
}

}
