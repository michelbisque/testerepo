/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author miche
 */
public class Empregado {
    
    private int id;
    private String nome;
    private double salario;

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    public void addSalario(double percent){
        this.salario=this.salario +(percent *0.01)*this.salario;
    }
    
}
