package laboratorio9;

class DepositoInvalidoException extends Exception{
    public DepositoInvalidoException(String mensaje){
        super(mensaje);
    }
}

class RetiroInvalidoException extends Exception{
    public RetiroInvalidoException(String mensaje){
        super(mensaje);
    }
}

class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}

class CuentaBancaria{
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void Depositar(double n_saldo){
        try {
            if (n_saldo<0) {
                throw new DepositoInvalidoException("No se puede insertar una cantidad negativa");
            }
            this.saldo += n_saldo;
            System.out.println("Deposito exitoso. Saldo total: " + saldo);
        } catch (DepositoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void Retirar(double n_saldo){
        try {
            if (n_saldo<0) {
                throw new RetiroInvalidoException("No se puede retirar una cantidad negativa");
            }
            if (n_saldo > saldo) {
                throw new FondosInsuficientesException("No se puede retirar una cantidad mayor a la de su saldo");
            }
            saldo -= n_saldo;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } catch (RetiroInvalidoException | FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Excepciones{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("CWXS", 500.0);

        // Intentar un deposito invalido
        cuenta.Depositar(-50.0); // Error: No se puede depositar una cantidad negativa

        // Intentar un deposito valido
        cuenta.Depositar(50.0); // Saldo disponible: 550.0

        // Intentar un retiro válido
        cuenta.Retirar(100.0); // Saldo restante: 400.0

        // Intentar un retiro con monto negativo
        cuenta.Retirar(-50.0); // Error: No se puede retirar una cantidad negativa

        // Intentar un retiro mayor al saldo disponible
        cuenta.Retirar(600.0); // Error: No se puede retirar una cantidad mayor a la de su saldo
    }
}