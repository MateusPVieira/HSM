package sistemaeventos;

import java.util.Scanner;

/**
 *
 * @author math_
 */
public class SistemaEventos {
    public static void main(String[] args) {
        System.out.println("### Sistema de Gerenciamento de Eventos ###");
        System.out.println("--------------------------------------------");
        System.out.print("Quantos Eventos quer registrar?: ");
        Scanner sn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int num = sn.nextInt();
        
        Evento Event[] = new Evento[num];
        Responsavel Resp[] = new Responsavel[num];
        Palestrante MaM = new Palestrante();
        Palestrante MeM = new Palestrante();
        Palestrante MM = new Palestrante();        
        for (int c = 0; c < num; c++) {
            Resp[c] = new Responsavel();
            Event[c] = new Evento();
            System.out.print("Qual nome do " + (c + 1) + "º Evento?: ");
            Event[c].setNomeEvento(sc.nextLine());
           System.out.println("### Sobre o Responsável pelo Evento ###");
            System.out.print("Qual nome do Responsável pelo Evento " + Event[c].getNomeEvento() + " ? ");
            Resp[c].setNomeResp(sc.nextLine());
            System.out.print("Telefone para contato do Responsável " + Resp[c].getNomeResp() + ": ");
            Resp[c].setContatoResp(sc.nextLine());
            System.out.print("Valor da Hora do Responsável " + Resp[c].getNomeResp() + ": R$ ");
            Resp[c].setValorHoraResp(sc.nextFloat());
            System.out.print("Informações adicionais de " + Resp[c].getNomeResp() + ": ");
            Resp[c].setInfo(sc.nextLine());
           System.out.println("### Sobre o Evento " + Event[c].getNomeEvento() + " ###");
            System.out.print("Qual a data de Início do Evento? (ex. ddmmaaaa): ");
            Event[c].setDataInicioEvento(sc.nextLine());
            System.out.print("Qual a data de Fim do Evento? (ex. ddmmaaaa): ");
            Event[c].setDataFimEvento(sc.nextLine());
            
           System.out.println("### Sobre Palestras do Evento " + Event[c].getNomeEvento() +  " ###");
            System.out.print("Quantas Palestras o Evento " + Event[c].getNomeEvento() + " terá?: ");
            int i = sc.nextInt();
            Event[c].setTotPal(i);
            
            Palestra pales[][] = new Palestra[num][i];
            Palestrante trante[][] = new Palestrante[num][i];
            for (int cc = 0; cc < i; cc++ ){
               pales[c][cc] = new Palestra();
               trante[c][cc] = new Palestrante();
                sc = new Scanner(System.in);
                System.out.print("Qual o Título da " + (cc + 1) + "ª Palestra?: ");
                pales[c][cc].setTitulo(sc.nextLine());                
                System.out.print("Qual o Horário de Início da Palestra " + pales[c][cc].getTitulo() + "?(ex. 20h30): ");
                pales[c][cc].setHorarioInicio(sn.next());
                System.out.print("Qual o Horário de Fim da Palestra " + pales[c][cc].getTitulo() + "?(ex. 22h30): ");
                pales[c][cc].setHorarioFim(sc.next());
                System.out.print("Qual é o Palestrante da Palestra " + pales[c][cc].getTitulo() + "?: ");
                    trante[c][cc].setNomePalestrante(sn.next());
                System.out.print("Qual é o contato do Palestrante " + trante[c][cc].getNomePalestrante() + "?: ");
                    trante[c][cc].setContatoPalestrante(sc.next());
                sn = new Scanner(System.in);       
                System.out.print("Qual é o valor da Hora do Palestrante " + trante[c][cc].getNomePalestrante() + "?: R$ ");
                    trante[c][cc].setValorHora(sn.nextFloat());
                sc = new Scanner(System.in);    
                System.out.print("Adicione uma descrição para a Palestra " + pales[c][cc].getTitulo() + ": ");
                    pales[c][cc].setDescri(sc.nextLine());
                System.out.print("Qual é a Carga Horária da Palestra " + pales[c][cc].getTitulo() + "?(ex. 8): ");
                    pales[c][cc].setCargaHorariaPalestra(sn.nextFloat());                    
                Event[c].setTotPal(Event[c].getTotPal() + (pales[c][cc].getCargaHorariaPalestra() * trante[c][cc].getValorHora()));
                Event[c].setCargaHorariaEvento(Event[c].getCargaHorariaEvento() + pales[c][cc].getCargaHorariaPalestra());
                Event[c].setLista(Event[c].getLista() + "\n " + pales[c][cc].getTitulo());
                if ((pales[c][cc].getCargaHorariaPalestra() * trante[c][cc].getValorHora()) > MM.getMaValor()){
                    MM.setMaValor(pales[c][cc].getCargaHorariaPalestra() * trante[c][cc].getValorHora());
                    MaM.setPaleMaValor(trante[c][cc].getNomePalestrante());
                    MaM.setValorHora(trante[c][cc].getValorHora());
                    MaM.setContatoPalestrante(trante[c][cc].getContatoPalestrante());
                    MaM.setNomePalestrante(trante[c][cc].getNomePalestrante());
                }   
                if ((pales[c][cc].getCargaHorariaPalestra() * trante[c][cc].getValorHora()) < MM.getMeValor()){
                    MM.setMeValor((pales[c][cc].getCargaHorariaPalestra() * trante[c][cc].getValorHora()));
                    MeM.setValorHora(trante[c][cc].getValorHora());
                    MeM.setContatoPalestrante(trante[c][cc].getContatoPalestrante());
                    MeM.setNomePalestrante(trante[c][cc].getNomePalestrante());
                }
            }
        }
         System.out.println("### Informações do Sistema de Gestão ###");
            System.out.println("----------------------------------------------");
            for (int ccc = 0; ccc < num; ccc++){
                System.out.println("Valor gasto com o Responsável " + Resp[ccc].getNomeResp());
                System.out.println("R$ " + Math.round(Event[ccc].getCargaHorariaEvento() * Resp[ccc].getValorHoraResp()));
                System.out.println("----------------------------------------------");
                System.out.println("Valor Gasto com as Palestras " + Event[ccc].getLista());
                System.out.println("R$ " + Math.round(Event[ccc].getTotPal()));
                System.out.println("----------------------------------------------");
                   /* for (int e = 0; e < Event[ccc].getTotPal() ; e++){
                        int s = 0
                        System.out.println("O valor gasto com a Palestra" + pales[c][cc].getTitulo());
                    }*/
            }
            System.out.println("Palestrante com o Maior Valor gasto em sua Palestra: ");
            System.out.println(MaM.toString());
            System.out.println("----------------------------------------------");
            System.out.println("Palestrante com o Menor Valor gasto em sua Palestra: ");
            System.out.println(MeM.toString());
   }
    
}
