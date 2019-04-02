/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralibros;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menu {
    public static void main (String[] args ){
        Lista list = new Lista();
        Scanner Entrada =new Scanner (System.in);
            int opcion;
            String titulo,autor,isbn;
           do{
       System.out.println("Ingresa la opcion");
       System.out.println("1.insertarPrincipio\n2.insertarFinal\n3.insertarDespues\n4.obtener\n5.contar\n6.eliminaPrincipio\n7.eliminarUltimo\n8.eliminarLibro");
        opcion= Entrada.nextInt();
     
        switch (opcion){
            case 1:
               System.out.println("Ingrese el libro");
               titulo=Entrada.nextLine();
               System.out.println("Ingrese el autor");
               autor=Entrada.nextLine();
               System.out.println("Ingrese el isbn");
               isbn=Entrada.nextLine();
               list.insertarPrincipio(libro = new libro(titulo,autor,isbn));
               
               
                break;
            case 2:
                list.Listar();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
          
              
            
        }
        } while (opcion!=0);
       
       
    }

 
}
