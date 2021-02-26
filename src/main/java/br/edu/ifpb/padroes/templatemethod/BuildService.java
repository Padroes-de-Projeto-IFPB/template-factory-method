package br.edu.ifpb.padroes.templatemethod;

public abstract class BuildService {

    public void build() {
        this.test();
        this.lint();
        this.assemble();
        this.deploy();
    }

    abstract public void test();
    abstract public void lint();
    abstract public void assemble();
    abstract public void deploy();

}
