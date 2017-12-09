/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.pkg70;

import java.util.Arrays;

/**
 *
 * @author JOSE JAVIER
 */
public class Video71 {
public class ProgramaDelVideo71 {

    /**
     * @param args the command line arguments
     */
     String [] arreglo;
   int tamanio,contador;
    public Video70(int tam){
        tamanio = tam;
        arreglo=new String[tam];
        Arrays.fill(arreglo,"-1");
        
        
    }
    public void funcionHash (String[] cadenaArreglo, String[]) arreglo){
        int i;
        for (i = 0; i < cadenaArreglo.length; i++){
            String elemento = cadenaArreglo [i];
            int indiceArreglo = Integer.parseInt(elemento)% 7;
            System.out.println("el indice es"+indiceArreglo +
                    "Para el elemento o valor" ´elemento);
                    //tratando las coliciones 
                    while (arreglo[indiceArreglo]!="-1"){
                        indiceArreglo++;
                        System.out.println("ocurrio una colision en el indice "+
                                (indiceArreglo-1) + "Cambiar al indice "+
                                indiceArreglo);
                        indiceArreglo%=tamanio;
                                  
        }
                    arreglo[indiceArreglo]=elemento;
        }
        
    }
    //Metodo para mostrar la tabla
    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++){
            incremento += 8;
            for (j = 0; j < 71; j++){
                System.out.println("-");
                
            }
            System.out.println();
            for (j = incremento  -8; j < incremento; j++){
                System.out.format(" %3s "+ "", j);
                
            }
            System.out.println("-");
            for (int n = 0; n < 71; n++){
                System.out.println("-");
                
            }
            System.out.println("-");
             for (j = incremento  -8; j < incremento; j++){
                 if (arreglo[j].equals("-1")){
                     System.out.println("  ");
                 }else {
                     System.out.print(String.format(" %3s "+ "", arreglo));
                                   
                 }
             }
             System.out.println("-");
             for (j = 0; j < 71; j++){
                 System.out.println("  ");
                 
             }
             System.out.println();
        }
        
    }
    //metodo para buscar clave
    punlic String buscarClave(String elemento){
        int indiceArreglo=Integer.parseInt(elemento)%7;
        int contador=0;
        while(!"-1".equals(arreglo [indiceArreglo])){
            if(arreglo[indiceArreglo] == null ? elemento == null : arreglo[indiceArreglo].equals(elemento)){
                 System.out.println("el elemento" + elemento +
                         "Fue encontrado en el indice " + indiceArreglo);
                 return arreglo[indiceArreglo];
                
            }
            indiceArreglo++;
            indiceArreglo%=tamanio;
            contador++;
            if (contador > 7){
                break;
            }
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       programa del video 71 hash=new Video70(8);
        String[] elementos={"20","33","21","10","12","14","56","100"};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        String buscado=hash.buscarClave("33");
        if(buscado==null){
            System.out.println("el elemento 333 no se encuntra en la tabla");
            
        }

    }
    
}
       
