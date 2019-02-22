package ExercíciosRevisão;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        System.out.println("Entre com o Total de Vendas: ");
        Scanner sc=new Scanner(System.in);
        double TotalVendas = sc.nextDouble();
        double comissao = TotalVendas * 0,1;
        System.out.println(comissao);

        }
    }
