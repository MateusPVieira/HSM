package sisgestao;

import java.util.Scanner;

public class SisGestao {


    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in); 
    
    System.out.println("Sistema de Gestão Acadêmico");
    System.out.println("=======================================");
    
//nome
    System.out.print("Digite o nome do Aluno: ");
    String nome = teclado.nextLine();

//notas
//1B
    System.out.print("Digite a Nota da Prova 1: ");
        float nProva1 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Projeto 1: ");
        float nProj1 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota da Lista de Exercícios 1: ");
        float nlisExe1 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Contribuição em Projetos/MOOCs 1: ");
        float ncontPS1 = Float.valueOf(teclado.nextLine());
    System.out.println("=======================================");    
 //2B
    System.out.print("Digite a Nota da Prova 2: ");
        float nProva2 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Projeto 2: ");
        float nProj2 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota da Lista de Exercícios 2: ");
        float nlisExe2 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Contribuição em Projetos/MOOCs 2: ");
        float ncontPS2 = Float.valueOf(teclado.nextLine());
    System.out.println("=======================================");
        
//Médias
    float mB1 = ((nProva1*3)+(nProj1*3)+(nlisExe1*2)+(ncontPS1*3))/11;
    float mB2 = ((nProva2*3)+(nProj2*3)+(nlisExe2*2)+(ncontPS2*3))/11;
    float mSem = Math.round((mB1+mB2)/2);
    System.out.println("A média semestral de " + nome + " é " + mSem);
    
if (mSem >= 8) {
    System.out.println("Portanto " + nome + " foi APROVADO!" );  
} else {
    float nFinal = (mSem - 10)*-1;
    System.out.println("Portanto " + nome + " foi REPROVADO!" );
    System.out.println( nome + " precisará de " + Math.round(nFinal) + " na Prova Final para ser APROVADO");
             
}
             
    }
    
}
