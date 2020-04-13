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
public class BaiTap1Main {
    public static void main(String[] args) {
        
        LopHoc lh=new LopHoc();
        HocSinh hs= new HocSinh("CNTT3", "Lập Trình Tốt", "Thanh Sơn", 23, "Ninh Hoa", "09326566");
        HocSinh hs1= new HocSinh("CNTT3", "Giao Tiếp Tốt", "Trúc mai", 21, "Ninh Hoa", "09326566");
        HocSinh hs2= new HocSinh("CNTT3", "Tiếng Anh", "Hải Trần", 25, "Ninh Hoa", "09326566");
        
        GiaoVien gv =new GiaoVien("Toán", "CNTT", "Thanh Thảo", 45, "Khanh Hoa", "09655613");
        GiaoVien gv1 =new GiaoVien("Lý", "CNTT", "Trần Thông", 43, "Khanh Hoa", "096545613");
        GiaoVien gv2 =new GiaoVien("Tin Học", "CNTT", "Phước Kỉnh", 56, "Khanh Hoa", "0965561343");
        
        lh.ThemHS(hs);
        lh.ThemHS(hs1);
        lh.ThemHS(hs2);
        
        lh.ThemGv(gv);
        lh.ThemGv(gv1);
        lh.ThemGv(gv2);
        
        lh.inDsHs();
        lh.inDsGv();
    }
}
