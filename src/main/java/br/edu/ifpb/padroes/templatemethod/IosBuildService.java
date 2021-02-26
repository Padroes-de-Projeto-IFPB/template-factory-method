package br.edu.ifpb.padroes.templatemethod;

public class IosBuildService extends BuildService {
    @Override
    public void test() {
        System.out.println("Running IOS tests");
    }

    @Override
    public void lint() {
        System.out.println("Linting IOS code");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the IOS build");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying IOS build to server");
    }
}
