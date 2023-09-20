/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc1_sem6_2221281_villodas;

/**
 *
 * @author alumno
 */
public class SMTPSender implements MailSender{
     String nEmail;
    
    public SMTPSender(){
        this.nEmail="jhersvin.villodas@usil.pe";
    }
    public SMTPSender(String newEmail){
        this.nEmail=newEmail;
    }
    @Override
    public String send(String email){
       return "Email comun entregado a "+email; 
    }
}
