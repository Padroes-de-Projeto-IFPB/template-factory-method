package br.edu.ifpb.padroes.factorymethod;

public class Designer implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Asking about Usability!");
    }
}
