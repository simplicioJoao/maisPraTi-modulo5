public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Inverter um array
        int[] vetorInvertido = new int[vetor.length];
        for(int i = vetor.length - 1, j = 0; i >= 0; i--, j++) {
            vetorInvertido[j] = vetor[i];
        }
        System.out.println("Vetor invertido:");
        for(int i = 0; i < vetorInvertido.length; i++) {
            System.out.println(vetorInvertido[i]);
        }

        // Adicionar elemento ao array
        int[] vetorElementoAdicionado = new int[vetor.length + 1];
        vetorElementoAdicionado[vetor.length] = 6;
        for(int i = 0; i < vetor.length; i++) {
            vetorElementoAdicionado[i] = vetor[i];
        }
        System.out.println("Vetor com elemento adicionado:");
        for(int i = 0; i < vetorElementoAdicionado.length; i++) {
            System.out.println(vetorElementoAdicionado[i]);
        }

        // Remover elemento do array
        int[] vetorElementoRemovido = new int[vetor.length - 1];
        for(int i = 0; i < vetorElementoRemovido.length; i++) {
            vetorElementoRemovido[i] = vetor[i];
        }
        System.out.println("Vetor com elemento removido:");
        for(int i = 0; i < vetorElementoRemovido.length; i++) {
            System.out.println(vetorElementoRemovido[i]);
        }

        // Pesquisar elemento no array
        int elementoPesquisado = 2;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == elementoPesquisado) {
                System.out.println("Elemento " + elementoPesquisado + " encontrado na posição " + i);
            }
        }

        // Somar diagonal principal e secundária de uma matriz
        int somaPrincipal = 0, somaSecundaria = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    somaPrincipal += matriz[i][j];
                }
                if(i + j == matriz.length - 1) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        // Rotacionar a matriz 90 graus
        int n = matriz.length;
        int[][] matrizRotacionada = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrizRotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }

        System.out.println("Matriz rotacionada 90 graus:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
}