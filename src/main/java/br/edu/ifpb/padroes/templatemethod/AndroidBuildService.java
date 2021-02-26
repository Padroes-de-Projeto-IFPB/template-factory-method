package br.edu.ifpb.padroes.templatemethod;

public class AndroidBuildService extends BuildService {
    @Override
    public void test() {
        System.out.println("Running Android tests");
    }

    @Override
    public void lint() {
        System.out.println("Linting Android code");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the Android build");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying Android build to server");
    }
}
