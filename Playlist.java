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

        // Swap songs
        int firstIndexToSwap = desertIslandPlaylist.indexOf("Mad Doctor");
        String firstToSwap = desertIslandPlaylist.get(firstIndexToSwap);
        int secondIndexToSwap = desertIslandPlaylist.indexOf("Get down");
        String SecondToSwap = desertIslandPlaylist.get(secondIndexToSwap);

        desertIslandPlaylist.set(firstIndexToSwap, SecondToSwap);
        desertIslandPlaylist.set(secondIndexToSwap, firstToSwap);
        System.out.println(desertIslandPlaylist);
    }

}
