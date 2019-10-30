
package boletin5;
import java.util.Scanner;

public class Boletin5 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
    conta conta1=new conta("Juan", "1234", 3456.6);
    conta1.visualizar();
    
        System.out.println("El saldo actual de la cuenta es: "+conta1.getSaldo());
        
        conta1.Ingreso(123.45);
        System.out.println("El saldo después del ingreso es de: "+conta1.getSaldo());
    
        conta1.Reintegro(2234.7);
        System.out.println("El saldo después del reintegroes de: "+conta1.getSaldo());
    
    conta conta2=new conta ("Martin", "90890", 867689.7);
        
        System.out.println("Las cuentas antes de la tranferencia tienen:\nConta1: "+conta1.getSaldo()+"\nConta2: "+conta2.getSaldo());
        
        conta1.transferenciaIngresar(conta2, 340.24);
        conta2.transferenciaDescontar(conta1, 340.24);
System.out.println("Después de la transferencia las cuentas quedan con: \nConta1: "+conta1.getSaldo()+" \nConta2: "+conta2.getSaldo());

        
        
        
        
        
        
    }
    
}
