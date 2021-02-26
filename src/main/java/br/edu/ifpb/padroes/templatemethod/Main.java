package br.edu.ifpb.padroes.templatemethod;

public class Main {

    public static void main(String[] args) {

        BuildService androidBuild = new AndroidBuildService();
        androidBuild.build();

        BuildService iosBuild = new IosBuildService();
        iosBuild.build();

    }

}
