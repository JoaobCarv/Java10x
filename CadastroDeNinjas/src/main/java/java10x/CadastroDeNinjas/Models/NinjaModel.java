package java10x.CadastroDeNinjas.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(long id, String name, String email, int idade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
