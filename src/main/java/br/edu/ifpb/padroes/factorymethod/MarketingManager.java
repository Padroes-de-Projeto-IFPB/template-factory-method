package br.edu.ifpb.padroes.factorymethod;

public class MarketingManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
