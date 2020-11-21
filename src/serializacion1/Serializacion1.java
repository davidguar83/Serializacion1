/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author david
 */
public class Serializacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException  {

        MClase obxeto1 = new MClase("ola", -7, 2.7E10);
        MClase obxeto2 = new MClase();

        Object a = new Object();

        try {

            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/serial.txt"));
            ObjectInputStream ler = new ObjectInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/serial.txt"));

            escribir.writeObject(obxeto1);

            escribir.close();

            // casteo en dor pasos
            
            /*  a=ler.readObject();
            obxeto2 = (MClase)a;                 
            
            //haria lo mismo que lo de abajo, casteo en un paso
             */
            
            obxeto2 = (MClase) ler.readObject();

            System.out.println(obxeto2.getNome());
            System.out.println(obxeto2.getNumero1());
            System.out.println(obxeto2.getNumero2());

            ler.close();

        } catch (IOException ex) {
            System.out.println("Error 1");;
        }

    }

}
