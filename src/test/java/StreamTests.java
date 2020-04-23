import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class StreamTests {


    private List<Type> types = List.of(
            new Type(1, "EAU", List.of("ELECTRICITE")),
            new Type(2, "PLANTE", List.of("VOL", "FEU")),
            new Type(3, "FEU", List.of("EAU")),
            new Type(4, "NORMAL", null),
            new Type(5, "POISON", List.of("FEU", "PSY"))
    );

    private List<Espece> especes = List.of(
            new Espece(1, "Carapuce", types.get(0), null),
            new Espece(3, "Bulbizarre", types.get(1), types.get(4)),
            new Espece(4, "Salamèche", types.get(2), null),
            new Espece(5, "Rattata", types.get(3), null)
    );


    @Test
    public void foreach() {
        String s = "";
        // Parcourir les types pour ajouter dans s le toString de chacun des éléments de la liste separes par des virgules
        assertEquals(s, types.toString());
    }

    @Test
    public void flatMap() {
        List<List<String>> namesNested = List.of(List.of("Jeff", "Bezos"),
                List.of("Bill", "Gates"),
                List.of("Mark", "Zuckerberg"));
        List<String> flatNames = null;
        assertEquals(6, flatNames.size());
        assertEquals(List.of("Jeff", "Bezos", "Bill", "Gates", "Mark", "Zuckerberg"), flatNames);


    }

    @Test
    public void collect() {
        Set<Espece> especesSet = null;
        //Convertir la liste des especes en un Set d'especes contenant les mêmes éléments
        assertEquals(4, especesSet.size());
        assertTrue(especesSet.contains(especes.get(0)));
        assertTrue(especesSet.contains(especes.get(1)));
        assertTrue(especesSet.contains(especes.get(2)));
        assertTrue(especesSet.contains(especes.get(3)));
    }

    @Test
    public void sort() {
        List<Espece> especeList = null;
        //Trier la liste des especes par ordre alphabétique de leur nom
        assertEquals(especes.get(1), especeList.get(0));
        assertEquals(especes.get(0), especeList.get(1));
        assertEquals(especes.get(2), especeList.get(2));
        assertEquals(especes.get(3), especeList.get(3));
    }

    @Test
    public void filter() {
        Espece carapuce = null;
        //Recuperer Carapuce
        assertEquals(especes.get(0), carapuce);
    }

    @Test
    public void count() {
        Integer sansTypeSecondaires = 0;
        // Compter le nombre de pokemon sans type secondaire
        assertEquals(3, sansTypeSecondaires);
    }


    @Test
    public void map() {
        List<Type> typesPrincipaux = null;
        //Convertir la liste des especes pour récupérer la liste des types principaux
        assertEquals(4, types.size());
        assertEquals(types.get(0), typesPrincipaux.get(0));
        assertEquals(types.get(1), typesPrincipaux.get(1));
        assertEquals(types.get(2), typesPrincipaux.get(2));
        assertEquals(types.get(3), typesPrincipaux.get(3));
    }

    @Test
    public void map2() {
        List<Type> typesSecondaires = null;
        //Convertir la liste des especes pour récupérer la liste des types secondaires non null
        assertEquals(1, typesSecondaires.size());
        assertEquals(types.get(4), typesSecondaires.size());
    }

    @Test
    public void findFirst() {
        Espece idPair = null;
        //Recuperer une espèce d'ID Pair
        assertEquals(especes.get(2), idPair);
    }


    @Test
    public void exception() {
        //Trouver l'espece rattatac dans la liste des Especes, Sinon lever une exceptin
        assertThrows(Exception.class, () -> {
            throw new NullPointerException();
        });
    }

    @Test
    public void reduce() {
        Integer sommeids = null;
        //Recuperer la somme de tous les ids de type
        assertEquals(15, sommeids);
    }


    @Test
    public void merge() {
        String string = "";
        //Ajouter les chiffres de 1 à 4 au nom à l'espèce d'id 5, stocker le tout dans une chaine
        assertEquals("Rattata1Rattata2Rattata3Rattata4Rattata5", string);
    }

    @Test
    public void groupBy() {
        Map<Type, Espece> map = null;
        //Regrouper les Especes par type principal dans une Map
        assertEquals(4, map.entrySet().size());
        assertTrue(map.keySet().contains(types.get(0)));
        assertTrue(map.keySet().contains(types.get(1)));
        assertTrue(map.keySet().contains(types.get(2)));
        assertTrue(map.keySet().contains(types.get(3)));
    }

    @Test
    public void mix() {
        List<String> faiblesses = null;
        // Recuperer toutes les faiblesses de Bulbizarre, sans doublon et triées par ordre alphabétique
        assertEquals(4, faiblesses.size());
        assertEquals("FEU", faiblesses.get(0));
        assertEquals("PSY", faiblesses.get(1));
        assertEquals("VOL", faiblesses.get(2));
    }

}
