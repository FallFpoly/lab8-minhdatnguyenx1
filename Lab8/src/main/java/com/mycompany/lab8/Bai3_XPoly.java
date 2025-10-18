/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class Bai3_XPoly {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chuỗi: ");
            String s = sc.nextLine();
            String ketQua = XPoly.toUpperFirstChar(s);
            System.out.println("Chuỗi sau khi chuyển: " + ketQua);
        }
}
