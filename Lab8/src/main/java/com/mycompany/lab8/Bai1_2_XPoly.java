/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class Bai1_2_XPoly {
    public static void main(String[] args) {
            double tong = XPoly.sum(2.5, 4.0, 5.5, 1.0);
            double lonNhat = XPoly.max(2.5, 4.0, 5.5, 1.0);
            double nhoNhat = XPoly.min(2.5, 4.0, 5.5, 1.0);

            System.out.println("Tổng = " + tong);
            System.out.println("Số lớn nhất = " + lonNhat);
            System.out.println("Số nhỏ nhất = " + nhoNhat);
        }
}
