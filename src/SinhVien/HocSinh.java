/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates  //Võ Trung Hà
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author DT
 */
public class HocSinh extends CaNhan{
    private String Lop;
    private String NangKhieu;

    public HocSinh(String Lop, String NangKhieu, String Ten, int Tuoi, String Diachi, String sdt) {
       //Võ Trung Hà
        super(Ten, Tuoi, Diachi, sdt);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }

    public String getLop() {
        return Lop;
    }

    public String getNangKhieu() {
        return NangKhieu;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setNangKhieu(String NangKhieu) {
        this.NangKhieu = NangKhieu;
    } 

    @Override
    public String toString() {
        return  "Tên: "+getTen()+"\n"+
                            "Tuổi: "+getTuoi()+"\n"+  //VTH
                            "Địa Chỉ: "+getDiachi()+"\n"+
                            "Năng Khiếu: "+NangKhieu+"\n"+
                            "lớp: "+Lop+"\n" ;
                
                }
    
    @Override
    public void HienThiTT() {
         
        System.out.println("Tên: "+getTen()+"\n"+
                            "Tuổi: "+getTuoi()+"\n"+  //VTH
                            "Địa Chỉ: "+getDiachi()+"\n"+
                            "Năng Khiếu: "+NangKhieu+"\n"+
                            "lớp: "+Lop+"\n" 
        );
    }

}
