/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class TongHDComparator implements Comparator<TongHoaDon> {

    @Override
    public int compare(TongHoaDon o1, TongHoaDon o2) {
        return o1.getTongGia()-o2.getTongGia();
    }
    
}
