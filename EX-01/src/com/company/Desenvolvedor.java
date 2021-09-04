package com.company;

public class Desenvolvedor extends Funcionario{
    private String senha;

    public Desenvolvedor(String n, String s, double sal, String senha){
        super(n, s, sal);
        this.senha = senha;

    }
    @Override
    public String toString(){
        return super.toString()+ "         " + this.senha;
    }
}
