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
 //3B
   System.out.print("Digite a Nota da Prova 3: ");
    float nProva3 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Projeto 3: ");
    float nProj3 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota da Lista de Exercícios 3: ");
    float nlisExe3 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Contribuição em Projetos/MOOCs 3: ");
    float ncontPS3 = Float.valueOf(teclado.nextLine());
    System.out.println("=======================================");
 //4B
   System.out.print("Digite a Nota da Prova 4: ");
    float nProva4 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Projeto 4: ");
    float nProj4 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota da Lista de Exercícios 4: ");
    float nlisExe4 = Float.valueOf(teclado.nextLine());
    System.out.print("Digite a Nota de Contribuição em Projetos/MOOCs 4: ");
    float ncontPS4 = Float.valueOf(teclado.nextLine());
    System.out.println("=======================================");
        
//Médias
float mB1 = ((nProva1*3)+(nProj1*3)+(nlisExe1*2)+(ncontPS1*3))/11;
float mB2 = ((nProva2*3)+(nProj2*3)+(nlisExe2*2)+(ncontPS2*3))/11;
float mB3 = ((nProva3*3)+(nProj3*3)+(nlisExe3*2)+(ncontPS3*3))/11;
float mB4 = ((nProva4*3)+(nProj4*3)+(nlisExe4*2)+(ncontPS4*3))/11;
float mSem = Math.round((mB1+mB2+mB3+mB4)/4);
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
