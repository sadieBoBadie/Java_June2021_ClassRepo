import java.util.HashMap;
import java.util.Set;

public class TrackList {

    public static void main(String[] args) {
        // Tasks:
        // ● Create a trackList of type HashMap

        HashMap<String, String> trackList = new HashMap<String, String>();

        // ● Add in at least 4 songs that are stored by title
        trackList.put(
            "I Love You",
            "I love you \nHums the April breeze\n I love you Echo the hills\n"
        );
        trackList.put("Blackbird", 
            "Pack up all my cares and woe, here I go, singing low"
        );

        trackList.put(
            "September in the Rain",
            "The leaves of brown \n Came tumbling down, remember\nIn September in the rain"
            );

        trackList.put("How High the Moon",
        "Somewhere there's music\nHow faint the tune\nSomewhere there's heaven\nHow high the moon"
        );


        // ● Pull out one of the songs by its track title
        String howHighLyrics = trackList.get("How High the Moon");
        System.out.print(howHighLyrics + "\n\n");

        // ● Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> songsTitles = trackList.keySet();
        for (String songTitle : songsTitles) {
            System.out.println(songTitle + "\n");
            System.out.println(trackList.get(songTitle)+"\n\n");
        }
    }

    
}