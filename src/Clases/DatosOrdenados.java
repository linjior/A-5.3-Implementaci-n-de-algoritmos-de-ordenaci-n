
package Clases;

import javax.swing.JOptionPane;

public class DatosOrdenados {
    
    int n,s;

    public DatosOrdenados(int n, int s) {
        this.n = n;
        this.s = s;
    }

    public void setN(int n) {
        //n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos datos son?"));
        this.n = n;
    }

    public void setS(int s) {
        //s=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el valor máximo?"));
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    public String generarLista(){
        int [] arreglo = new int[n];
        String cad="";
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * s) + 1;
            System.out.println("Arreglo: "+(i+1)+"--->"+arreglo[i]);
            cad=""+arreglo[i];
        }
        return cad;
    }
    
    
        
        
    
}
