/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeed;

import java.util.Scanner;

/**
 *
 * @author Pref. Valinhos
 */
public class TesteED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] estados = new String [4];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
             
        System.out.println("OS estados registrados são:");
        for(int i = 0;i<estados.length; i++){
            System.out.println("ESTADO N." + i +" = "+ estados[i]);
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o estado que deseja buscar: ");
        String siglaBusca = teclado.nextLine();
        
        boolean encontrou = false;
        for(int i=0; i<estados.length;i++){
            String elemento = estados[i];
            if(elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            }     
        }
        
        if(encontrou == true){
            System.out.println("Entrou veyr");
        }else{
            System.out.println("Não encontrou veyrr");
        }
        
    }
    
}
