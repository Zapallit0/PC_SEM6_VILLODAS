/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pc1_sem6_2221281_villodas;

/**
 *
 * @author alumno
 */
public class PC1_SEM6_2221281_VILLODAS {

    public static void main(String[] args) {
        
        MailSender protegido =new SendGridSender();
        MailSender comun=new SMTPSender();
        
        String mail_1="Julian@gmail.com";
        String mail_2="Julian@gmail.com";
        String mail_3="Julian@gmail.com";
        String mail_4="Julian@gmail.com";
        String mail_5="Julian@gmail.com";
        String mail_6="Julian@gmail.com";
        String mail_7="Julian@gmail.com";
        
                   
        System.out.println(protegido.send(mail_7));
        System.out.println(comun.send(mail_1));
        
        
        
    }
}
