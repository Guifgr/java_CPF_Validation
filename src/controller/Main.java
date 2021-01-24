package controller;

import model.Cpf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Inset your Brazilian CPF to be validated");
        System.out.println("Insert your cpf: ");

        Scanner scanner = new Scanner(System.in);
        String getCpf = scanner.nextLine();
        var cpf = new Cpf();

        cpf.setCpfNumber(getCpf);
        cpf.validCpf(cpf);

        System.out.println(cpf.isValid());
    }
}
