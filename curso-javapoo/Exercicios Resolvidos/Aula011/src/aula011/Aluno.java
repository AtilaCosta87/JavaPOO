/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author atila
 */
public class Aluno extends Pessoa{
    // Atributos
    private int matricula;
    private String Curso;
    // Métodos
    public void pagarMensalidade () {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
    // Métodos Especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
}
