package br.edu.ifpb.padroes.factorymethod;

public class Developer implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Asking about Design Patterns!");
    }
}
