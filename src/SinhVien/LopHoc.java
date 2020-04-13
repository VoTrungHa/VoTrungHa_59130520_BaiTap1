/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DT
 */
public class LopHoc {
    QLDS ql=new QLDS();
    public void ThemHS(HocSinh hs)
    {
        ql.Them(hs);
    }
    public void ThemGv(GiaoVien gv)
    {
        ql.Them(gv);
    }
    
    public void inDsGv()
    {
        Iterator itr=ql.dsCaNhan.iterator();
        while (itr.hasNext()) {
            Object next = itr.next();
            if(next instanceof GiaoVien)
            System.out.println(next); 
        } 
    } 
    
    public void inDsHs()
    {
       Iterator itr=ql.dsCaNhan.iterator();
        while (itr.hasNext()) {
            Object next = itr.next();
            if(next instanceof HocSinh)
            System.out.println(next); 
        } 
        
    }
}
