/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author DT
 */
public abstract class CaNhan {
    private String Ten;
    private int Tuoi;
    private String Diachi;
    private String sdt;

    public CaNhan() {
    }
    
    public CaNhan(String Ten, int Tuoi, String Diachi, String sdt) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Diachi = Diachi;
        this.sdt = sdt;
    }
    

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public abstract void HienThiTT();
}
