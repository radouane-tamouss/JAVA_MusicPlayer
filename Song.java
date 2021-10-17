public class Song {
    private String titre;
    private double duree;

    public Song(String titre, double duree) {
        this.titre = titre;
        this.duree = duree;
    }

    public Song() {

    }

    public String getTitre() {
        return titre;
    }

    public double getDuree() {
        return duree;
    }

    // @Override
    public String toString() {
        return "Song{" + "titre='" + titre + '\'' + ", durée=" + duree + '}';
    }

}
