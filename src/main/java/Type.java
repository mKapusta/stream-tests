import java.util.List;

public class Type {
    private Integer id;
    private String nom;
    private List<String> faiblesses;

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    public Type(Integer id, String nom, List<String> faiblesses) {
        this.id = id;
        this.nom = nom;
        this.faiblesses = faiblesses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
