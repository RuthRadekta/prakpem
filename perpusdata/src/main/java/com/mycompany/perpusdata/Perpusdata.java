/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;

import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Perpusdata {

    public static void main(String[] args) {
        System.out.println("Hello Dita!");
        try {
            Koneksi tesKoneksi = new Koneksi();
            LoginClass tesLogin = new LoginClass();
            String username = null;
            String password = null;
            tesLogin.input();
            tesLogin.login(username, password);
            tesKoneksi.tutup();
            /*
            CRUDAnggota tesCrudA = new CRUDAnggota();
            tesCrudA.read();
            tesCrudA.delete();
            */
            CRUDBuku tesCrudB = new CRUDBuku();
            tesCrudB.update();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
