/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aadhithya
 */
public class chemproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
             
             Connection con = DriverManager.getConnection("jdbc:derby:chem;");
             //Connection con = DriverManager.getConnection("jdbc:derby:chem;create=true");
             Statement sta = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
             /*sta.execute("CREATE TABLE metal (" +
             "  name varchar(25) NOT NULL," +
             "  chem varchar(7) NOT NULL," +
             "  molarmass varchar(7) NOT NULL," +
             "  bandgap decimal(10,4) NOT NULL," +
             "  description varchar(80) DEFAULT NULL," +
             "  PRIMARY KEY (name)\n" +
             ")");
             sta.execute("INSERT INTO metal VALUES ('Aluminium(III) Oxide','Al2O3','101.96',6.9600,'white solid ,odourless'),('Barium oxide','BaO','153.32',5.2000,'white solid'),('Beryllium(II) monoxide','BeO','25.01',10.6000,'Colourless, vitreous crystals, Odourless'),('BorontriOxide','B2O3','69.618',8.4500,'white , glassy solid'),('Cadmium oxide','CdO','128.41',2.5000,'colorless powder(alpha) red-brown crystal(beta) , odourless'),('Calcium Oxide','CaO','56.077',6.2600,'white -> pale yellow/brown pow.,odourles'),('Cerium(IV) oxide','CeO2','172.11',3.7800,'white or pale yellow solid,slightly hygroscopic'),('Chromium(III) Oxide','Cr2O3','151.99',2.5800,'light to dark green,fine crystals'),('Cobalt(II) oxide','CoO','74.932',3.2000,'black powder , odourless'),('Copper(I) oxide','Cu2O','143.09',2.0400,'brownish-red solid'),('Europium oxide','Eu2O3','351.92',4.3000,'white powder'),('Gallium(III) oxide','Ga2O3','187.44',5.4000,'white crystalline powder'),('Germanium dioxide','GeO2','104.638',5.3500,'white powder or colourless crystals'),('Indium(III) oxide','In2O3','277.64',3.5500,'yellowish green odorless crystals'),('Iron(II) oxide','FeO','71.844',3.2000,'black crystals'),('Lanthanum(III) oxide','La2O3','325.80',5.5000,'white powder hygroscopic'),('Magnesium Oxide','MgO','40.304',7.8000,'white powder , odourless'),('Manganese(II) oxide','MnO','70.937',4.0000,'green crystals or powder'),('Neodymium(III) oxide','Nd2O3','336.48',4.6000,'light bluish hexagonal gray crystals'),('Nickel(II) oxide','NiO','74.692',2.8600,'green crystalline solid'),('Praseodymium(III) oxide','Pr2O3','329.81',3.8000,'white hexagonal crystals'),('Strontium oxide','SrO','103.61',6.5000,'colourless cubic crystals'),('Tin dioxide','SnO2','150.71',3.5700,'white or light grey powder'),('Titanium diOxide','TiO','79.866',3.6000,'white solid ,odourless'),('Zinc oxide','ZnO','81.38',3.3000,'white solid odourless')");*/
            Form1 f1=new Form1();
            f1.setVisible(true);
             
         }
         catch(Exception ex){
             System.out.println(ex.getMessage());
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
       }// </editor-fold>                        
    
  
    
    
