package desafioCatalisa;

import java.util.*;

public class desafio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> armazenaNumeroDigitado = new ArrayList<>();
        List<Integer> pontoQuaseCerto = new ArrayList<>();
        List<Integer> valorPontoCerto = new ArrayList<>();

        Random numeroAleatorioA = new Random();

        boolean continuarJogo = true;
        boolean rodadaAtiva = true;
        int quaseCerto = 5;
        int pontoCerto = 10;


        System.out.println("Bem vindo ao jogo da adivinhação de números");
        System.out.println("Escolha sua dificuldade");
        System.out.println("1 - Fácil (numeros aleatórios de 1 a 5) ");
        System.out.println("2 - Médio (numeros aleatórios de 1 a 20) ");
        System.out.println("3 - Difícil (numeros aleatórios de 1 a 50) ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                while (continuarJogo) {
                    int low = 1;
                    int high = 5;
                    int numeroSorteado = numeroAleatorioA.nextInt(high - low) + low;

                    while (rodadaAtiva) {
                        System.out.println("Digite um numero");
                        int numeroDigitado = input.nextInt();

                        armazenaNumeroDigitado.add(numeroDigitado);

                        if (numeroDigitado == numeroSorteado) {
                            rodadaAtiva = false;
                            valorPontoCerto.add(pontoCerto);

                        } else if ((numeroDigitado == numeroSorteado - 1) || (numeroDigitado == numeroSorteado + 1)) {
                            pontoQuaseCerto.add(quaseCerto);

                        } else {
                            System.out.println("Voce perdeu !!! ");
                            rodadaAtiva = false;
                        }
                        int somaPontoQuaseCerto = 0;
                        for (int i = 0; i < pontoQuaseCerto.size(); i++) {
                            somaPontoQuaseCerto += pontoQuaseCerto.get(i);
                        }

                        System.out.println("Numeros digitados " +armazenaNumeroDigitado);
                        System.out.println("Pontos adquiridos na rodada " + somaPontoQuaseCerto);
                        System.out.println("Ponto ganho ao acertar o número " +valorPontoCerto);
                        System.out.println("Numero sorteado: " +numeroSorteado);
                    }

                    System.out.println("Deseja continuar jogo? 1 - SIM / 2 - NAO ");
                    int resposta = input.nextInt();
                    if (resposta == 1) {
                        rodadaAtiva = true;
                    } else {
                        System.out.println(" -------- Jogo encerrando .....---------");
                        continuarJogo = false;
                    }
                }
            case 2:
                while (continuarJogo) {
                    int low = 1;
                    int high = 20;
                    int numeroSorteado = numeroAleatorioA.nextInt(high - low) + low;

                    while (rodadaAtiva) {
                        System.out.println("Digite um numero");
                        int numeroDigitado = input.nextInt();

                        armazenaNumeroDigitado.add(numeroDigitado);

                        if (numeroDigitado == numeroSorteado) {
                            rodadaAtiva = false;
                            valorPontoCerto.add(pontoCerto);

                        } else if ((numeroDigitado == numeroSorteado - 1) || (numeroDigitado == numeroSorteado + 1)) {
                            pontoQuaseCerto.add(quaseCerto);

                        } else {
                            System.out.println("Voce perdeu !!! ");
                            rodadaAtiva = false;
                        }
                        int somaPontoQuaseCerto = 0;
                        for (int i = 0; i < pontoQuaseCerto.size(); i++) {
                            somaPontoQuaseCerto += pontoQuaseCerto.get(i);
                        }

                        System.out.println("Numeros digitados " +armazenaNumeroDigitado);
                        System.out.println("Pontos adquiridos na rodada " + somaPontoQuaseCerto);
                        System.out.println("Ponto ganho ao acertar o número " +valorPontoCerto);
                        System.out.println("Numero sorteado: " +numeroSorteado);
                    }

                    System.out.println("Deseja continuar jogo? 1 - SIM / 2 - NAO ");
                    int resposta = input.nextInt();
                    if (resposta == 1) {
                        rodadaAtiva = true;
                    } else {
                        System.out.println(" -------- Jogo encerrando .....---------");
                        continuarJogo = false;
                    }

                }
            case 3:
                while (continuarJogo) {
                    int low = 1;
                    int high = 50;
                    int numeroSorteado = numeroAleatorioA.nextInt(high - low) + low;

                    while (rodadaAtiva) {
                        System.out.println("Digite um numero");
                        int numeroDigitado = input.nextInt();

                        armazenaNumeroDigitado.add(numeroDigitado);

                        if (numeroDigitado == numeroSorteado) {
                            rodadaAtiva = false;
                            valorPontoCerto.add(pontoCerto);

                        } else if ((numeroDigitado == numeroSorteado - 1) || (numeroDigitado == numeroSorteado + 1)) {
                            pontoQuaseCerto.add(quaseCerto);

                        } else {
                            System.out.println("Voce perdeu !!! ");
                            rodadaAtiva = false;
                        }

                        int somaPontoQuaseCerto = 0;
                        for (int i = 0; i < pontoQuaseCerto.size(); i++) {
                            somaPontoQuaseCerto += pontoQuaseCerto.get(i);
                        }
                        System.out.println("Numeros digitados " +armazenaNumeroDigitado);
                        System.out.println("Pontos adquiridos na rodada " + somaPontoQuaseCerto);
                        System.out.println("Ponto ganho ao acertar o número " +valorPontoCerto);
                        System.out.println("Numero sorteado: " +numeroSorteado);
                    }
                    System.out.println("Deseja continuar jogo? 1 - SIM / 2 - NAO ");
                    int resposta = input.nextInt();
                    if (resposta == 1) {
                        rodadaAtiva = true;
                    } else {
                        System.out.println(" -------- Jogo encerrando ---------");
                        continuarJogo = false;
                    }
                }
        }
    }
}













