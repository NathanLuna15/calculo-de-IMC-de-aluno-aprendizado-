package br.senai.sp.jandira.ds1t.imc_academia.model;

import java.util.Scanner;

public class imcAluno {

    String nome;
    double altura;
    double peso;
    double soma;
    double soma1;
    double imc;
    String resultadoFinal;

    public void ObiterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("digite seu peso (em Kg): ");
        peso = leitor.nextDouble();
        System.out.print("digite sua altura: ");
        altura = leitor.nextDouble();
        Calculo();
    }

    public void Calculo(){
      soma = altura * altura;
      soma1 = peso /soma;
      imc = soma1;
      ClassificarPseo();
     }

    public void ClassificarPseo(){
        if(imc < 18.6) {
           resultadoFinal ="status do peso: abaixo do peso";
            
        }else if (imc >= 18.6 && imc < 25.0){
            resultadoFinal = "status do peso: ideal (saldavel) ";
            
        } else if (imc >= 25.0 && imc < 30.0) {
            resultadoFinal = "status do peso: levemente acima do pesso";

        } else if (imc >= 30.0 && imc < 35.0) {
            resultadoFinal = "status do peso: obesidade gral 1";

        } else if (imc >= 35.0 && imc < 40.0) {
            resultadoFinal = "status do peso: obesidade gral 2 (severa)";

        }else {
            resultadoFinal = "status do peso: GORDÃO DA XJ";
        }
        ExibirResultado();
    }

    public void ExibirResultado(){
        String imcCurto = String.format("%.2f", imc);
        System.out.println("RESULTADO");
        System.out.println("Aluno: " + nome);
        System.out.println("IMC calculado: " +imcCurto);
        System.out.println(resultadoFinal);
    }

}
