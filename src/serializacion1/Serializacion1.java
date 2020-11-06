/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Serializacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

        MClase obxeto1 = new MClase("ola", -7, 2.7E10);
        MClase obxeto2 = new MClase();

        try {

            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/serial.txt"));
            ObjectInputStream ler = new ObjectInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/serial.txt"));

            escribir.writeObject(obxeto1);

            escribir.close();

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
