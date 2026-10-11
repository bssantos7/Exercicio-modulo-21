package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Pessoa pessoa1 = new Pessoa("bruno", 38);
        Pessoa pessoa2 = new Pessoa("bruno", 38);
        Pessoa pessoa3 = new Pessoa("bruno", 38);
        Pessoa pessoa4 = new Pessoa("maria", 27);
        Pessoa pessoa5 = new Pessoa("joao", 40);
        Pessoa pessoa6 = new Pessoa("lucelia", 70);
        Pessoa pessoa7 = new Pessoa("lucelia", 70);
        Pessoa pessoa8 = new Pessoa("bruno", 20);
        Pessoa pessoa9 = new Pessoa("mariana", 56);
        Pessoa pessoa10 = new Pessoa("bruno", 38);

        Set <Pessoa> listaPessoas = new HashSet<>();

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);
        listaPessoas.add(pessoa5);
        listaPessoas.add(pessoa6);
        listaPessoas.add(pessoa7);
        listaPessoas.add(pessoa8);
        listaPessoas.add(pessoa9);
        listaPessoas.add(pessoa10);


        System.out.println("O Conjunto de contem "+listaPessoas.size());
        for(Pessoa pessoa:listaPessoas){
            System.out.println(pessoa.toString());
        }

        System.out.println("O conjunto ficou com "+listaPessoas.size()+" porque i HashSet não permite a inclusão de dados iguais");
        System.out.println("para funcionar é necessário que a clásse tenha implementando os metodos Equals e Hasecode que servem para verificar se um objeto é igual a outro.");
        System.out.println("Isso é importante pois os java verifica se os dois objetos são iguais e não apenas e possuem o mesmo endereço de mémória");
        
    }
}
