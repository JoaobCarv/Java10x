package java10x.CadastroDeNinjas.Missions;

import jakarta.persistence.*;
import java10x.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String difficultity;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;

    public MissionModel() {
    }

    public MissionModel(long id, String name, String difficultity) {
        this.id = id;
        this.name = name;
        this.difficultity = difficultity;
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

    public String getDifficultity() {
        return difficultity;
    }

    public void setDifficultity(String difficultity) {
        this.difficultity = difficultity;
    }
}
