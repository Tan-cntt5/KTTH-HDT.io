package qlpm;
public class PhongMay{
     private MayTinh[] danhSachMay;
    
 public PhongMay(int soMay){
     danhSachMay = new.MayTinh[soMay];
 }
 public void themMay(MayTinh mayTinh,int viTri){
     danhSachMay[viTri]=mayTinh;
 }
 public void getmay(int viTri){
     return danhSachMay[viTri];
 }
 public void kiemTraTrangThaiPhongmay(){
     for(MayTinh mayTinh :  danhSachMay){
         if (mayTinh != null){
             mayTinh.kiemTraTrangThai();
         }
     }
 }
}
