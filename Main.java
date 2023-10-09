package Exercicio21;

import java.util.*;

    public class Main {
        public static void main(String[] args) {
            
            Scanner leitor = new Scanner(System.in);
            
            String nome;
            char sexo = 'm'; 
            int idade ;
            char saude = 'b';
            char continuar = 's' ;
            int apto = 0;
            int inapto = 0;
            int total = 0;
            
            while( continuar == 'S' || continuar == 's') {
                System.out.println("Informe o nome");
                nome = leitor.next();
                total = total + 1;
                System.out.println("Informe a idade");
                idade = leitor.nextInt();
                
                    if (idade >= 18 && idade <= 45) {
                        System.out.println("Informe o sexo. F = Feminino e M = Masculino");
                        sexo = leitor.next().charAt(0);
                        if (sexo == 'm' || sexo == 'M'){
                            System.out.println("Informe o estado de sa�de: B = Bom e R = Ruim");
                            saude = leitor.next().charAt(0);
                            if (saude == 'b' || sexo == 'B'){
                            apto = apto + 1;     
                            }else{
                                inapto = inapto + 1; 
                                System.out.println("Inapto para o servi�o militar obrigat�rio por motivos de sa�de.");
                            }
                        } else {
                            inapto = inapto + 1;
                            System.out.println("Inapto para o servi�o militar obrigat�rio por ser do sexo feminino.");
                        }   
                    } else {
                            System.out.println("Idade n�o eleg�vel para o servi�o militar obrigat�rio.");
                            inapto = inapto + 1;
                    }
                        
                System.out.println("Quantidade de aptos: "+apto);
                System.out.println("Quantidade de inaptos: "+inapto);
                System.out.println("Total de inscritos: "+total);           
                System.out.println("Deseja continuar? Digite S para Sim e N para n�o");
                continuar = leitor.next().charAt(0);
            }
        }   
     }