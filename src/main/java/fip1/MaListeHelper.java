package fip1;

public class MaListeHelper {

    public static <T> MaListe<T> concat(MaListe<? extends T> l1, MaListe<? extends T> l2) {
        MaListe<T> result = new MaListe<>();
        for (int i = 0; i < l1.taille(); i++) {
            result.ajouter(l1.element(i));
        }
        for (int i = 0; i < l2.taille(); i++) {
            result.ajouter(l2.element(i));
        }
        return result;
    }
}