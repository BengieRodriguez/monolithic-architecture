/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.Cliente;
import datos.Persistencia;
import datos.Prestador;



public class Prueba {
    public static void main(String[] args) {
        //Cliente x = new Cliente("juan", "juan@gmail.com", "314599968");
        //Prestador y = new Prestador("julian", "de leon", "1234554", "persona", 12000);
        Persistencia per = new Persistencia();
        //per.guardarCliente(x);
        //per.guardarPrestador(y);
        System.out.println("exito");
        per.listarClientes();
    }
}
