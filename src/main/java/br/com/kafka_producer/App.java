package br.com.kafka_producer;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;

import br.com.kafka_producer.models.Aluno;
import br.com.kafka_producer.services.KafkaService;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        System.out.println("Enviando mensagem ...");

        var aluno = new Aluno();
        aluno.setNome("Danilo");
        aluno.setMatricula("001");

        var notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(8.0);

        aluno.setNotas(notas);

        String alunoParsed = new Gson().toJson(aluno);
        
        KafkaService.sendMessage("Aluno", alunoParsed);
    }
}

