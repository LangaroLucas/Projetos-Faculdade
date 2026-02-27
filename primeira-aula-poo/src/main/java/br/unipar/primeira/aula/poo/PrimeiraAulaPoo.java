/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.primeira.aula.poo;

/**
 *
 * @author lucas90498840
 */
public class PrimeiraAulaPoo {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno(); //instanciando um objeto
        aluno.nome = "Lucas";
        aluno.ra = "60005808";
        aluno.idade = 32;
        aluno.telefone = "(45)999497551";
        
        Aluno aluno2 = new Aluno(); //instanciando outro objeto
        aluno2.cpf = "01234567890";
        aluno2.idade = 11;
        aluno2.ra = "3424324";
        aluno2.nome = "Teste";
        
        System.out.println("Nome do aluno é " + aluno.nome);
        System.out.println("Nome do aluno é " + aluno2.nome);
        
        Camera camera = new Camera();
        camera.marca = "Tecpix";
        camera.modelo = "XJ600";
        camera.preco = 1950.00;
        
        Gato gato = new Gato();
        gato.cor = "Amarelo";
        gato.nome = "Tigelinha";
        gato.raca = "Vira-lata";
        
        System.out.println("Nome do gato é " + gato.nome);
        System.out.println("Valor da Câmera é R$ " + camera.preco);
        
        
        
    }
}
