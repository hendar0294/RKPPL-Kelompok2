/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.kelompok3.tubes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MainApp {
    public static void main(String[] args){
        int n = 10, n1 = 20, n2=30;
              
        C c = new C();
        c.setN1(n1);
        c.setN2(n2);
        System.out.println(c.add()+" adalah proses add");
        System.out.println(c.sub()+ " adalah proses sub");
        System.out.println(c.mul()+" adalah proses mul");
        System.out.println(c.div()+ " adalah proses div");
        
        D d = new D();
        System.out.println(d.pow(n1, n2)+" adalah proses pow");
        System.out.println(d.mul(n1, n2)+ " adalah proses mul");
        System.out.println(d.div(n1, n2)+ " adalah proses div");
         
        E e = new E();
        List dataList = new ArrayList();
        dataList.add(c);
        dataList.add(d);
        dataList.add(e);
        e.setDataList(dataList);
        System.out.println(e.getDataList());
        System.out.println(e.contains("C"));
        System.out.println(e.contains("D"));
        System.out.println(e.contains("E"));
        System.out.println(e.toString());
        
    }
    
}
