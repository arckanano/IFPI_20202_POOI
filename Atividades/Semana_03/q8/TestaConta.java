import javax.sound.midi.SysexMessage;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("1", 100);
        Conta c2 = new Conta("2", 100);
        // c1 = c2;

        // c1.transferir(c2, 50);

        System.out.println("---Saldo de cada conta---");
        System.out.println("Saldo conta 1: " + c1.saldo);
        System.out.println("Saldo conta 2: " + c2.saldo);

        System.out.println("---Realizando saque das contas---");
        if (c1.sacar(10)) {
            System.out.println("Saque realizado com sucesso. Novo saldo de c1: " + c1.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
        if (c2.sacar(150)) {
            System.out.println("Saque realizado com sucesso. Novo saldo de c2: " + c2.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("---Saldo de cada conta---");
        System.out.println("Saldo conta 1: " + c1.saldo);
        System.out.println("Saldo conta 2: " + c2.saldo);

        System.out.println("---Realizando transferencia entre as contas---");
        if (c2.transferir(c1, 15)) {
            System.out.println("Transferencia realizada!");
        } else {
            System.out.println("Transferencia não realizada por falta de saldo na conta atual!");
        }

        System.out.println("---Saldo de cada conta---");
        System.out.println("Saldo conta 1: " + c1.saldo);
        System.out.println("Saldo conta 2: " + c2.saldo);

    }
}
