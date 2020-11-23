import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Bad Kingdom");
        desertIslandPlaylist.add("Mad Doctor");
        desertIslandPlaylist.add("False Idols");
        desertIslandPlaylist.add("Supersyling");
        desertIslandPlaylist.add("Get down");
        desertIslandPlaylist.add("Paradise Circus");

        System.out.println(desertIslandPlaylist);

        int arrSize = desertIslandPlaylist.size();
        System.out.println("Array size is: " + arrSize + "\n");

        desertIslandPlaylist.remove(5);
        System.out.println("Array size after cut is: " + desertIslandPlaylist.size() + "\n");
    }
}
