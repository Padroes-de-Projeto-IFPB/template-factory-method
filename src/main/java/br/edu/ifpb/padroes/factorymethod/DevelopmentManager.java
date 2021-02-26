package br.edu.ifpb.padroes.factorymethod;

public class DevelopmentManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
