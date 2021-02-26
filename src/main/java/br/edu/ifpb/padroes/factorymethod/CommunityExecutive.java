package br.edu.ifpb.padroes.factorymethod;

public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about community building!");
    }
}
