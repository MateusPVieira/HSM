package calculadoravalores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author math_
 */
public class CalculadoraValores {

    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        Scanner tecl2 = new Scanner(System.in);
             
//Sistema
        System.out.println("Sistema de Gestão de Ações");
        System.out.println("======================================");
        System.out.print("Quantas ações serão registradas?: ");
        int numAc = tecl.nextInt();
        float mSemanal[][] = new float [numAc][4];
        float valorDia[][] = new float [numAc][28];
        float mediaMensal[] = new float [numAc];
        String nome [] = new String [numAc];
        float maiorMedia[] = new float[numAc];
        float menorMedia[] = new float[numAc];
        Arrays.fill(maiorMedia, 0);
        Arrays.fill(menorMedia, 1000);
            int cc = 0;
            for(int i = 0; i < numAc; i++){
                System.out.println("======================================");
                System.out.print("Qual é o nome da " + (i+1) + "ª ação que você que registrar?: ");
                nome[i] = tecl2.nextLine();                              
                    for (int c = 0; c < 28; c += 1){
                        System.out.print("Qual o valor da ação " + nome[i] + " no Dia " + (c + 1) + " ?: " );
                        valorDia[cc][c] = tecl.nextFloat();    
                    }
                        mSemanal[i][0] = Math.round((valorDia[i][0] + valorDia[i][1] + valorDia[i][2] + valorDia[i][3] +
                        valorDia[i][4] + valorDia[i][5] + valorDia[i][6])/7);
                        mSemanal[i][1] = Math.round((valorDia[i][7] + valorDia[i][8] + valorDia[i][9] + valorDia[i][10] +
                        valorDia[i][11] + valorDia[i][12] + valorDia[i][13])/7);
                        mSemanal[i][2] = Math.round((valorDia[i][14] + valorDia[i][15] + valorDia[i][16] + valorDia[i][17] +
                        valorDia[i][18] + valorDia[i][19] + valorDia[i][20])/7);
                        mSemanal[i][3] = Math.round((valorDia[i][21] + valorDia[i][22] + valorDia[i][23] + valorDia[i][24] +
                        valorDia[i][25] + valorDia[i][26] + valorDia[i][27])/7);
                        mediaMensal[i] = Math.round((mSemanal[i][0] + mSemanal[i][1] + mSemanal[i][2] + mSemanal[i][3])/4);
                        
                        if (mSemanal[i][0] > maiorMedia[i]){
                            maiorMedia[i] = mSemanal[i][0];                                    
                        } 
                        if (mSemanal[i][1] > maiorMedia[i]){
                            maiorMedia[i] = mSemanal[i][1];                            
                        }
                        if (mSemanal[i][2] > maiorMedia[i]){
                            maiorMedia[i] = mSemanal[i][2];                            
                        }
                        if (mSemanal[i][3] > maiorMedia[i]){
                            maiorMedia[i] = mSemanal[i][3];                            
                        }
                        
                        if (mSemanal[i][0] < menorMedia[i]){
                            menorMedia[i] = mSemanal[i][0];                                    
                        }
                        if (mSemanal[i][1] < menorMedia[i]){
                            menorMedia[i] = mSemanal[i][1];                            
                        }
                        if (mSemanal[i][2] < menorMedia[i]){
                            menorMedia[i] = mSemanal[i][2];                            
                        }
                        if (mSemanal[i][3] < menorMedia[i]){
                            menorMedia[i] = mSemanal[i][3];
                            
                        }    
        cc++;       
        }
        for (int e = 0; e < numAc; e += 1) {                

            System.out.println("======================================");
            System.out.println("As médias semanais de " + nome[e] + " são:" );
            System.out.println("Semana 1: " + mSemanal[e][0]);
            System.out.println("Semana 2: " + mSemanal[e][1]);
            System.out.println("Semana 3: " + mSemanal[e][2]);
            System.out.println("Semana 4: " + mSemanal[e][3]);
            System.out.println("Média Mensal: " + mediaMensal[e]);
            System.out.println("Maior Média Semanal: " + maiorMedia[e]);
            System.out.println("Menor Média Semanal: " + menorMedia[e]);
            System.out.println("======================================"); 
        
        }    
        
          
            
    }
    
}
