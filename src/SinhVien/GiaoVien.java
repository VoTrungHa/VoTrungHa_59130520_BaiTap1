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
public class GiaoVien extends CaNhan{
    private String MonDay ;
    private String toBoMon;

    public GiaoVien(String MonDay, String toBoMon, String Ten, int Tuoi, String Diachi, String sdt) {
        super(Ten, Tuoi, Diachi, sdt);
        this.MonDay = MonDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return MonDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    

    @Override
    public void HienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
