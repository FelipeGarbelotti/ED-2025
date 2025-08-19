public class TestaContador{
    public static void main(String[] args){
        Contador c1 = new Contador(); //chama construtor da classe (gera um objeto do tipo contador)
        Contador c2 = new Contador();

        c1.incrementar();
        c2.incrementar();
        c2.incrementar();
        System.out.printf("Valor de c1: %d\n", c1.valor);
        System.out.printf("Valor de c2: %d\n", c2.valor);
    }
}