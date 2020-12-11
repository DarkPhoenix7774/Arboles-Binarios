package ArbolesBinarios;

public class ArbolBinarioBusqueda {

   private Nodo raiz;

   public ArbolBinarioBusqueda(){


       raiz = null;



   }

   public boolean estaVacio(){

       return raiz == null;

   }

   private void Arbol(Nodo padre , Nodo hijo , int dato ){


       if (hijo  ==  null)
       {

           Nodo nuevo = new Nodo(null , dato , null);

           if (dato >= padre.getDato() )
           {

               padre.setDerecho(nuevo);

           }
           else {

               padre.setIzquierdo(nuevo);

           }

       }
       else
           {

               if (dato >= padre.getDato() )
               {

                   Arbol(hijo , hijo.getDerecho(), dato);

               }
               else {

                   Arbol(padre, hijo.getIzquierdo(), dato);


               }



       }




   }

    public void Arbol(int dato ){



       if (estaVacio()){

           Nodo nuevo = new Nodo(null, dato , null);

           raiz = nuevo;

       }


       else {

           if (dato >= raiz.getDato()){


               Arbol(raiz , raiz.getDerecho(), dato);


           }
           else{

               Arbol( raiz , raiz.getIzquierdo(), dato);

           }

       }

    }


    private void mostrarInOrden(Nodo nodo){

       if (nodo == null){




       }

       else {


           mostrarInOrden(nodo.getIzquierdo());

           System.out.print(nodo.getDato() + "  " );

           mostrarInOrden(nodo.getDerecho());



       }

    }


    public void mostrarInOrden(){

       Nodo temp = raiz;

       mostrarInOrden(raiz);

        System.out.println();


    }


    private void mostrarPreOrden(Nodo nodo){

        if (nodo == null){




        }

        else {


            mostrarInOrden(nodo.getIzquierdo());

            System.out.print(nodo.getDato() + "  " );

            mostrarInOrden(nodo.getDerecho());



        }

    }


    public void mostrarPreOrden(){

        Nodo temp = raiz;

        mostrarInOrden(raiz);

        System.out.println();


    }


    private void mostrarPostOrden(Nodo nodo){

        if (nodo == null){




        }

        else {


            mostrarInOrden(nodo.getIzquierdo());

            System.out.print(nodo.getDato() + "  " );

            mostrarInOrden(nodo.getDerecho());



        }

    }


    public void mostrarPostOrden(){

        Nodo temp = raiz;

        mostrarInOrden(raiz);

        System.out.println();


    }

}
