/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class XPoly {
    // Bài 1: tính tổng các số double
    public static final double sum(double... x) {
        double tong = 0;
        for (double a : x) {
            tong += a;
        }
        return tong;
    }

    // Bài 2: tìm số nhỏ nhất
    public static final double min(double... x) {
        double min = x[0];
        for (double a : x) {
            if (a < min) min = a;
        }
        return min;
    }

    // Bài 2: tìm số lớn nhất
    public static final double max(double... x) {
        double max = x[0];
        for (double a : x) {
            if (a > max) max = a;
        }
        return max;
    }

    // Bài 3: chuyển ký tự đầu mỗi từ sang in hoa
    public static final String toUpperFirstChar(String s) {
        String[] words = s.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
