package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - bloco de inicializacao estatico da super classe eh executado quando a JVM carregar a classe mae
    //0 - bloco de inicializacao estatico da sub classe eh executado quando a JVM carregar a classe filha
    //1 - alocado espaco em memoria pro objeto da classe mae
    //2 - cada atributo da super classe e criado e incializado com valores dafaut ou oq for passado
    //3 - bloco de inicializacao da super eh executado
    //4 - contrutor e executado da superclasse

    //5 - alocado espaco em memoria pro objeto da subclasse
    //6 - cada atributo da sub classe e criado e incializado com valores dafaut ou oq for passado
    //7 - bloco de inicializacao da subclasse eh executado
    //8 - contrutor e executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
//Dentro do bloco de inicializacao Static PESSOA
//Dentro do bloco de inicializacao Static FUNCIONARIO
//Dentro do bloco1 de inicializacao PESSOA
//Dentro do bloco2 de inicializacao PESSOA
//dentro do contrutor de pessoa
//Dentro do bloco1 de inicializacao FUNCIONARIO
//Dentro do bloco2 de inicializacao FUNCIONARIO
//Dentro do construtor func

        //primeiro inicializa os statics da classe mae e filha
        //depois incializa os blocos classe mae
        //depois passsa pelo construtor mae
        //inicializa os blocos classe filha
        //construtor filha
    }
}
