package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animal extends Consulta {
    String nome, sexo;
            int idade, id;

            Scanner scanner = new Scanner(System.in);

public void cadastrarAnimal(){
    System.out.println("///------------- Cadastro ----------------///");

    System.out.println("Qual é o tipo do animal: ");
    System.out.println(" [1 - Mamifero | 2 - Voador | 3 - Reptil ");
    int tipo = scanner.nextInt();

    System.out.println("Informe o nome do animal: ");
    nome = scanner.nextLine();
    System.out.println("Informe a especie do animal: ");
    super.especie = scanner.nextLine();
    System.out.println("Informe a idade do animal: ");
    idade = scanner.nextInt();
    System.out.println("Qual o sexo do animal");
    sexo = scanner.nextLine();
    System.out.println("Qual é a indentificação do animal: ");
    id = scanner.nextInt();
    System.out.println("Quais são seus hábitos alimentares?");
    super.habitosAlimentares = scanner.nextLine();




}
}
