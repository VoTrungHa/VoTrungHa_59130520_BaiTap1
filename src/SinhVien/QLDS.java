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
public class QLDS implements IQLDS{

    ArrayList<CaNhan> dsCaNhan =new ArrayList<>();
    @Override
    public void Them(CaNhan c) {
         dsCaNhan.add(c);
    }

    @Override
    public void Xoa(String t) {
        dsCaNhan.remove(t);
    }

    @Override
    public void InDS() {
        Iterator itr=dsCaNhan.iterator();
        while (itr.hasNext()) { //VTH
            Object next = itr.next();
            System.out.println(next);
        }
    }
    
}
