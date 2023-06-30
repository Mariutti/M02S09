package br.senai.lab360.ExercicioM02S09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicioM02S09Application {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioM02S09Application.class, args);
	}

}


//EX 01 Essa semana vamos trabalhar com banco de dados no nossos projeto de Spring. Inicialmente vamos precisar
// configurar nosso projeto para que efetue a conexão com o DB. Adicione a dependência do JPA no projeto e o driver
// de acordo com o RDBMS. Efetue a configuração no application.properties.

//EX 02 Após a configuração efetuada no exercício anterior, vamos criar uma entidade chamada “Pessoa”. Essa
// classe deverá conter os atributos: Id, name, email e status. O “id” será chave da tabela com o tipo Long, name e
// email serão String e status Boolean.

//EX 03 Efetue a criação do repositório da entidade de Pessoas e adicione-o no service de Pessoas para
// utilizarmos nos próximos exercícios.

//EX 04 Após a criação do repository, crie um método de inclusão no service e uma rota no controller que
// receberá uma pessoa que salvará no banco ao ser invocado o save no service.

//EX 05 Contendo dados no banco, crie no service um método que retornará todas as pessoas utilizando o
// repository. Mapeie esse método com a rota equivalente no Controller.

//TODO EX 06 Agora, crie um método que receberá um ID como parâmetro e retornará apenas a pessoa correspondente.
// Mapeie esse método com a rota equivalente no Controller.

//TODO EX 07 Crie um método no repositório que busque apenas as pessoas que estiverem com o status “true”. Assim
// como nos exercício anteriores, crie uma rota no controller, chama o service que irá buscar no repository esse método.

//TODO EX 08 Crie um método no service que receberá como parâmetro um objeto de Pessoa e se informado o ID e
// estiver na base, que efetue a atualização do objeto.

//TODO EX09 Crie um método no service que receberá o id de uma pessoa, chame o método de delete do repository
// para aquele id. Assim como nos exercícios anteriores, crie uma rota no controller, chama o service que irá buscar
// no repository esse método.

//TODO EX 10 Crie um método no repository que receberá uma string chamada filter. Esse método deverá buscar via
// JQPL ou Native Query as pessoas que tenham aquela string como parte do nome ou e-mail. Assim como nos exercícios
// anteriores, crie uma rota no controller, chama o service que irá buscar no repository esse método.