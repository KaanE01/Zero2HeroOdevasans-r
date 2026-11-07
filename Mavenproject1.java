package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("oldugunuz kati tuslayiniz=");                 //kat istedik
        int oKat = sc.nextInt();                                          //katı girdi
        if( oKat>10 || oKat<0 ){
            System.out.println("Binamizda boyle bir kat bulunmamaktadir");      //kat 0 10 arasında değilse bitir
        return;                                                                 //bitir komutu
        }
        
        
        System.out.println("gitmek istedigini kati tuslayiniz=");               //kat istedik
        int gitmekKat = sc.nextInt();                                           //katı girdi
        if( gitmekKat>10 || gitmekKat<0 ){
            System.out.println("Binamızda boyle bir kat bulunmamaktadır");      //kat 0 10 arasında değilse bitir
            return;                                                             //bitir komutu
        }
        
        
        if(oKat>gitmekKat){                                                     
            System.out.println(  oKat+ ". kattan "+ gitmekKat +". kata " + (oKat - gitmekKat) + " kadar asagi inilcek");      
        }
        
          
        if(oKat<gitmekKat){
            System.out.println( oKat+ ". kattan "+ gitmekKat +". kata " + (gitmekKat - oKat)  + " kat kadar yukari cikilcak");
        }
        
        
        if(oKat == gitmekKat){
            System.out.println("zaten bu kattasiniz");
       
        }
        
        
    }
    }


