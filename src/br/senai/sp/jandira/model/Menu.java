package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
public void executarMenu(){


        System.out.println("//------------------- Menu -------------------//");
        System.out.println("1 - Cadastrar Animal");
        System.out.println("2 - Editar Informações");
        System.out.println("3 - Sair");
        System.out.println("//--------------------------------------------//");

       int opcaoVisitante = scanner.nextInt();
       scanner.nextLine();

       switch(opcaoVisitante){
           case 1:
                animal.cadastrarAnimal();
               break;
           case 2:

               break;

           case 3:
               break;
       }
}

    }
