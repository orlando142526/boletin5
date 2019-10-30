
package boletin5;


public class conta {
     private String nome;
    private String numConta;
    private double saldo;
    

// Métodos

    //constructor por defecto
    public conta(){
        
    }

    //constructor con parámetros
    public conta(String nome, String numConta, double saldo){
        this.nome=nome;
        this.numConta=numConta;
        this.saldo=saldo;
    }

    // setters
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setNumConta(String numConta){
        this.numConta=numConta;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    // getters
    
    public String getNome(){
        return nome;
    }
    
    public String getNumConta(){
        return numConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    // método para el ingreso
    
    public  void Ingreso(double cantidad){
        if(cantidad<0){
            System.out.println("False");
        }
        else
       System.out.println((saldo +=cantidad)+" True");
    }
    
    // método para el reintegro
    
    public void Reintegro(double cantidad){
        if (cantidad<0){
            System.out.println("False");
        }
        else
        if (saldo< cantidad){
            System.out.println("False");
        }
        else  
        System.out.println((saldo-=cantidad)+" True");
    }
    
    public void visualizar(){
        System.out.println("El nombre del cliente: "+nome+"\nEl número de cuenta: "+numConta+"\nEl saldo: "+saldo);
    }
    
    // métodos para hacer la transferencia
    
    public void transferenciaIngresar(conta destino, double cantidad){
        destino.setSaldo(destino.getSaldo() + cantidad);
    }
    public void transferenciaDescontar(conta origen, double cantidad){
origen.setSaldo(origen.getSaldo() - cantidad);
     
    
}
    
    
    
}
