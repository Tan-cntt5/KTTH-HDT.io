package qlpm;
public class MayTinhVanPhong extends MayTinh{
    private String phanMemVanPhong;
public MayTinhVanPhong(String ten, String cpu, String phanMemVanPhong,int ram){
    super(ten, cpu, ram);
    this.phanMemVanPhong=phanMemVanPhong;
    }
public String getphanMemVanPhong(){
    return phanMemVanPhong;
    }
public void setphanMemVanPhong(String phanMemVanPhong){
    this.phanMemVanPhong=phanMemVanPhong;
    }
} 
        
