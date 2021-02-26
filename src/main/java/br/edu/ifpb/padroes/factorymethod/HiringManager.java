package br.edu.ifpb.padroes.factorymethod;

public abstract class HiringManager {

    // Factory method
    abstract protected Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }

}
