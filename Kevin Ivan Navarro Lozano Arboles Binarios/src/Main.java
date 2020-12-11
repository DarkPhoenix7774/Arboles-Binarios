import ArbolesBinarios.ArbolBinarioBusqueda;

public class Main {

    public static void main(String[] args) {

        ArbolBinarioBusqueda insertar = new ArbolBinarioBusqueda();

        System.out.println("MOSTRANDO LOS NUMEROS EN ORDEN");

        insertar.Arbol(0);
        insertar.Arbol(2);
        insertar.Arbol(4);
        insertar.Arbol(1);
        insertar.Arbol(3);
        insertar.Arbol(5);
        insertar.Arbol(7);
        insertar.Arbol(6);



        insertar.mostrarPreOrden();

        System.out.println("MOSTRANDO LOS NUMEROS EN PRE-ORDEN");

        insertar.Arbol(43);
        insertar.Arbol(24);
        insertar.Arbol(62);
        insertar.Arbol(122);
        insertar.Arbol(342);
        insertar.Arbol(52);
        insertar.Arbol(724);
        insertar.Arbol(20);

        insertar.mostrarInOrden();

        System.out.println("MOSTRANDO LOS NUMEROS EN  POST-ORDEN ");

        insertar.Arbol(41);
        insertar.Arbol(234);
        insertar.Arbol(642);
        insertar.Arbol(1522);
        insertar.Arbol(3452);
        insertar.Arbol(542);
        insertar.Arbol(7324);
        insertar.Arbol(202);

        insertar.mostrarPostOrden();




    }
}
