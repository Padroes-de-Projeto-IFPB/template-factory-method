package br.edu.ifpb.padroes.factorymethod;

public class DesignerManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Designer();
    }
}
