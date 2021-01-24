
public class TestaArrays {
    public static void main(String[] args) {
        // Criar e instancia um array de notas
        int[] notas = new int[3];
        notas[0] = 7;
        notas[1] = 9;
        notas[2] = 8;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
        // Array statico
        int[] valores = {10, -1, 3}; 
        System.out.println(valores[0]);
        
        // Imprimindo usando um For resumido
        // Lê-se: PATA item IN ITENS
        for (int valor : valores) {
            System.out.println(valor);
        }
        
        String nome = "guilherme";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.charAt(0));
        
        for (int i = 0; i < nome.length(); i++) {
            System.out.print(nome.charAt(i) + " ");    
        }
        System.out.println();
        // trim: retirar espaços antes e depois da
        // string
        String nome2 = "    daniel    ";
        System.out.println(nome2.trim());
    }
}
