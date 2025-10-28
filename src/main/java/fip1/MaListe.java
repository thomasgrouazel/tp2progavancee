package fip1;

public class MaListe<T> {
    private Object[] elements;
    private int size;

    public MaListe() {
        this.elements = new Object[10]; 
        this.size = 0;
    }

    // Ajoute un élément en fin de liste
    public void ajouter(T element) {
        elements[size] = element;
        size++;
    }

    
    public int taille() {
        return size;
    }

    // R à indice i
    @SuppressWarnings("unchecked")
    public T element(int i) {
        return (T) elements[i];
    }

    // ajoute el d'une liste dans la liste courante
    public void ajouterListe(MaListe<? extends T> autreListe) {
        for (int i = 0; i < autreListe.taille(); i++) {
            this.ajouter(autreListe.element(i));
        }
    }

    // inverse, ajoute les el de liste courante dans autreListe
    public void ajouterDansListe(MaListe<? super T> autreListe) {
        for (int i = 0; i < this.taille(); i++) {
            autreListe.ajouter(this.element(i));
        }
    }

    // stringify les el de la liste
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}