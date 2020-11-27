/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azzam
 */
public class penghitung {
   private double hasil;
    public void usdtoother(double a, double b){
        hasil = a*b;
    }
    public void othertousd(double a, double b){
        hasil =a/b;          
    }
    public double ambilhasil(){
    return hasil;
}
}
