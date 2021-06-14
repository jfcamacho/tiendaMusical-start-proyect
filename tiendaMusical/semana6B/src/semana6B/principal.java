/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6B;

import DAO.Personas;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas persona1 = new Personas("Luis", "Japón", "Quevedo", "2104573", "21904527");
        Personas persona2 = new Personas("Ana", "Gualaceo", "Loja", "1312313", "21904527");
        Personas persona3 = new Personas("Javier", "Carrion", "Quito", "2534534");
        Personas persona4 = new Personas("Jaime", "Ortega", "Otavalo", "644564", "21904527");
        Personas persona5 = new Personas("Janny", "Sarango", "Saraguro", "4566646");
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        System.out.println(persona5);
    }
    
}

/**
 * Desarrollar un programa el cual me permita registrar personas, cuentas, tarjetas, este programa contará con un 
 * menú el cual me permita visualizar la información de la cuenta o de la tajeta de cada persona
 * 
 * Registrar por defecto 5 personas 
 * Tres personas tendrán tarjeta de credito
 * Todos tendrán cuenta
 * Se debe poder realizar depositos
 * Se debe poder realizar retiros
 * Mostrar total de la cuenta
 */


