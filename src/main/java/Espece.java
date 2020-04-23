public class Espece {

    private Integer id;
    private String nom;
    private Type typePrincipal;
    private Type typeSecondaire;

    public Espece(Integer id, String nom, Type typePrincipal, Type typeSecondaire) {
        this.id = id;
        this.nom = nom;
        this.typePrincipal = typePrincipal;
        this.typeSecondaire = typeSecondaire;
    }

    @Override
    public String toString() {
        return "Espece{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", typePrincipal=" + typePrincipal +
                ", typeSecondaire=" + typeSecondaire +
                '}';
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

    public Type getTypePrincipal() {
        return typePrincipal;
    }

    public void setTypePrincipal(Type typePrincipal) {
        this.typePrincipal = typePrincipal;
    }

    public Type getTypeSecondaire() {
        return typeSecondaire;
    }

    public void setTypeSecondaire(Type typeSecondaire) {
        this.typeSecondaire = typeSecondaire;
    }
}
