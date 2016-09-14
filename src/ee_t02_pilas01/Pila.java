package ee_t02_pilas01;

import java.util.*;

public class Pila {

Character [] pila;
Integer tope;
Integer tam;
boolean bandera=false;

public Integer getTope(){
	return tope;
}


public Pila(Integer tamanio){
	tope=-1;
	pila=new Character[tamanio];
	tam=tamanio;
}

public void push(Character caracter){     
if(tope<tam -1)
{
    tope ++;
    pila[tope]=caracter;
} else {
    System.out.println("Desbordamiento");
}
}

public Character pop(){
    Character resultado=' ';
    if(tope>-1)
    {
    resultado=pila[tope];
    pila[tope]=null;
    tope--;
    }else{
     System.out.println("Subdesbordamiento");
    }
    return resultado;
}

public Character peek(){
    Character resultado=' ';
    if(tope>-1){
       resultado=pila[tope]; 
    }else{
        System.out.println("Subdesbordamiento");
    }
    return resultado;
    }

//Se crea el metodo RecorrerCadena se le pasa como parametro una cadena y un objeto p de tipo pila
public void recorrerCadena(String cadena, Pila p){
	 
    for(int i=0; i<cadena.length();i++)//El for empieza a recorrer la cadena
    {
    if(cadena.charAt(i)=='('||cadena.charAt(i)=='['||cadena.charAt(i)=='{')
   //Si en la cadena encuentra agrupadores que abre 
    {
    p.push(cadena.charAt(i));//Los mete en la pila  
    }
    else
    {
   if (cadena.charAt(i)==')'){//Si en la cadena encuentra un  agruador que cierra
    	    if(p.peek()=='(')// y si en el tope de la pila esta el que abre
      	     {
    	     p.pop();//Entonces que lo saque
    	     }
    	    else
    	    {
    	     System.out.println("No");// Que imprima return y que se salga 
    	     return;
    	     }
    	   }
          else   if (cadena.charAt(i)==']'){
    	     if (p.peek()=='['){
    	 
    	     p.pop();
    	     }
    	     else
    	     {
    	         System.out.println("No");
    	         return;
    	     }
    	  }
          else if (cadena.charAt(i)=='}'){
    	     if (p.peek()=='{')
    	     {
    	     p.pop();
    	     }
    	  } 
    	  else
    	  {
    	     System.out.println("No");
    	         return;
    	  } 
    	  }
    	     
    	 }
    	     if(pila[0]==null) // Si la pila queda vacia despues de hacer las comparaciones 
    	     {
    	      System.out.println("Si");//entonces imprime Si 
    	      }
    	 
    	 else
    	 {
    		 System.out.println("no");// que imprima no
    	 }
}
    	 public static void main(String [] args){
    	    	 Pila obj= new Pila (6);
    	    	 obj.recorrerCadena("[({})]" , obj);
    	    	  }
    	     }




