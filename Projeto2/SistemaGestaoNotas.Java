package sisgestao;

import java.util.Scanner;

/**
 *
 * @author math_
 */
public class ProjetoPiloto {
    
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        
//Variáveis e arrays        
        float mSemes;
        float mBim[] = new float [2];
        float nProva[] = new float[2];
	float nProjeto[] = new float[2];
	float nLista[] = new float[2];
        int num, nAP = 0, nRP = 0, nAF = 0;
        float media = 0, maNota = 0 , meNota = 10;

//Sistema
        System.out.println("Sistema de Gestão de Notas");
        System.out.println("------------------------------------------\n");
        System.out.print("Quanto alunos serão registrados?: ");
        num = tecl.nextInt();
        int i = 0;
    while (i < num) {    
        for (int c=0; c < 2; c++){
            System.out.print("Digite a Nota da Prova " + (c + 1) + ": ");
            nProva[c] = tecl.nextFloat();
            System.out.print("Digite a Nota do Projeto " + (c + 1) + ": ");
            nProjeto[c] = tecl.nextFloat();
            System.out.print("Digite a Nota da Lista " + (c + 1) + ": ");
            nLista[c] = tecl.nextFloat();
            System.out.println("=============================================");
        } 
        i++;
      
        mBim[0] = ((nProva[0]*5) + (nProjeto[0]*3) + (nLista[0]*2))/10;
        mBim[1] = ((nProva[1]*5) + (nProjeto[1]*3) + (nLista[1]*2))/10;
        mSemes = Math.round(mBim[0] + mBim[1])/2;
        if (mSemes > maNota) {
          maNota = mSemes;  
        }
        if (meNota > mSemes) {
            meNota = mSemes;            
        }
        media += mSemes;
        System.out.println("A Média Semestral desse aluno é :" + mSemes);
        System.out.print("Situação: ");  
            if (mSemes >= 8 ) {
                System.out.println("Aluno Aprovado!");
                nAP += 1;
                System.out.println("=============================================");
            } else if (mSemes <= 7.9 && mSemes >= 5) {
                System.out.println("Aluno deverá realizar Avaliação Final");
                nAF += 1;
                System.out.println("=============================================");
              } else {
                System.out.println("Aluno Reprovado!");
                nRP += 1;
                System.out.println("=============================================");
            }
    }
        float mediaF = Math.round(media/num);
        System.out.println("---------------------------------------------");
        System.out.println("Quantidade de alunos Aprovados: " + nAP);
        System.out.println("Quantidade de alunos em Avaliação Final: " +nAF);
        System.out.println("Quantidade de alunos Reprovados: " + nRP );
        System.out.println("Média Geral: " + mediaF);
        System.out.println("Maior Média: " + maNota );
        System.out.println("Menor Média: " + meNota);
            
            
            
        
        
                       
	}
}
