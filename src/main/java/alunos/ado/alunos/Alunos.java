package alunos.ado.alunos;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//RA
@Entity(name = "Aluno")
public class Alunos implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "RA")
    private Long RA;

    @Column(name = "CEP")
    private String CEP;

    @Column(name = "Numero")
    private int numero;

    @Column(name = "Complemento")
    private char complemento;

    @Column(name = "NotaADO1")
    private int notaADO1;

    @Column(name = "NotaPI")
    private int notaPI;

    
    public Alunos(int id, String nome, Long RA, String CEP, int numero, char complemento, int notaADO1, int notaPI) {
        this.id = id;
        this.nome = nome;
        this.RA = RA;
        this.CEP = CEP;
        this.numero = numero;
        this.complemento = complemento;
        this.notaADO1 = notaADO1;
        this.notaPI = notaPI;
    }

    public Alunos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRA() {
        return RA;
    }

    public void setRA(Long RA) {
        this.RA = RA;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getComplemento() {
        return complemento;
    }

    public void setComplemento(char complemento) {
        this.complemento = complemento;
    }

    public int getNotaADO1() {
        return notaADO1;
    }

    public void setNotaADO1(int notaADO1) {
        this.notaADO1 = notaADO1;
    }

    public int getNotaPI() {
        return notaPI;
    }

    public void setNotaPI(int notaPI) {
        this.notaPI = notaPI;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
