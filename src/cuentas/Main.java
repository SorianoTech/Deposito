
package cuentas;

/**
 *
 * @author Sergio Soriano
 */
public class Main {
   
    public static void main(String[] args) {
        operativa_cuenta(100);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        //Comentario añadido despues del primero commit
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        cuenta1.setNombre("Pepe");
        System.out.println(cuenta1.getNombre());
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

