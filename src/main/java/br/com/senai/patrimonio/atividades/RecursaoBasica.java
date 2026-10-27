package br.com.senai.patrimonio.atividades;

public class RecursaoBasica {

        public static int fatorial(int n){

            if( n==0 || n == 1 ){
                return 1;

            }
            return n * fatorial(n - 1);
    }


        public static int somaAteN(int n) {
            // Caso base: se n for menor ou igual a 1, retorna o próprio n
            if (n <= 1) {
                return n;
            }

            // Passo recursivo: soma o número atual com o resultado da soma até n - 1
            return n + somaAteN(n - 1);
        }

        public static void main(String[] args) {
            int resultado = somaAteN(4);
            System.out.println("somaAteN(4) -> " + resultado); // Saída: 10
        }
    }
