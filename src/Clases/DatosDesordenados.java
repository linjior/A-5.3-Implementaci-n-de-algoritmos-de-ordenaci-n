
package Clases;

public class DatosDesordenados {
    
    int i,j,temporal,pasadas;
    
    public DatosDesordenados(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    
    //Metodo burbuja version 1
    public void burbuja(int [] arreglo){
        pasadas=0;
        for(i=0;i<arreglo.length;i++){
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en "+pasadas+" Pasadas");
    }
    
    //Metodo burbuja version 2
    public void burbija2(int[] arreglo){
        pasadas=0;
        for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en "+pasadas+" Pasadas");
}
    
}
