import java.util.Scanner;


public class Exemplo01{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); //cria scanner io
        double[] consumos = new double[5];   //cria vetor de doubles

        for(int i=0; i < consumos.length; i++){
            System.out.printf("Consumo %d: ", (i+1));
            consumos[i] = entrada.nextDouble(); //nextDouble
        }    


        int qtde = 0;
        for(double consumo : consumos){ //percorre o vetor e copia o valor para a variavel (consumo)
            if(consumo>5000){           //nao é possivel altera o valor no vetor (nao acessa diretamente)
                System.out.printf("Consumo anomalo: %.1f\n", consumo);
                qtde+=1;
            } 
        }
        System.out.printf("Quantidade de consumos anomalos: %d\n", qtde);


    }
}