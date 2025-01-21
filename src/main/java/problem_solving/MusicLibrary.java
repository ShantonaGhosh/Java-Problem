
package problem_solving;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    
    ArrayList<String> songList= new ArrayList<String>();
    
    
    public void addSong(String song){
        songList.add(song);  
    }
    
    public void removeSong(String song){
        songList.remove(song);
    }
    public void playRandomSong(){
        if(songList.isEmpty()){
            System.out.println("the music library is empty");          
        } else {
            Random random= new Random();
            int randomIndex = random.nextInt(songList.size());
        System.out.println("now playing" + songList.get(randomIndex)); 
        }
    }
    
    public void displaySongs(){
        if(songList.isEmpty()){
                System.out.println("the music library is empty");
        }else{
            for(String song: songList ){
                System.out.println(" play"+ song);
            }
        }
    }
}
