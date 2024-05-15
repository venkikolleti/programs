import java.util.*;
import java.io.*;

class song{
    String title;
    double duration;
    public song(String title,double duration){
        this.title=title;
        this.duration=duration;
    }
    public song(){

    }
    public String getTitle(){
        return title;
    }
    public double getDuration(){
        return duration;
    }
    public String toString(){
        return "song{"+
                "title "+ title + ':' +
                "duration"+duration+'}';
    }

}


class album{
    private String name;
    private String artist;
    private ArrayList<song> songs;

    public album(String name,String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<song>();
    }
    public album(){

    }
    public song findSong(String title){
        for(song check:songs){
            if(check.getTitle().equals(title)){
                return check;
            }
        }
        return null;
    }
    
    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            songs.add(new song(title,duration));
            System.out.println(title+" successfully added to the list");
            return true;
        }
        else{
            System.out.println("Song with the name "+title+" already exists in the list");
            return false;
        }
    }

    public boolean addPlayList(int tracknumber,LinkedList<song> PlayList){
        int index=tracknumber-1;
        if(index>0 && index<=this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have song with tracknumer"+tracknumber);
        return false;
    }

    public boolean addPlayList(String title,LinkedList<song> PlayList){
            for(song check:this.songs){
                if(check.getTitle().equals(title)){
                    PlayList.add(check);
                    return true;
                }
            }
            System.out.println("there is no such song in album");
            return false;
    }



}


public class song_playlist {

    public static void main(String args[]){

        ArrayList<album> albums1=new ArrayList<>(null);

        album album=new album("album1","venki");
        album.addSong("jarumitaya",4.5);
        album.addSong("bossparty", 2.7);
        album.addSong("lux tapa", 5.3);
        album.addSong("kavalayya", 3.9);

        albums1.add(album);

        System.out.println("hiii");

        LinkedList<song> playList=new LinkedList<>(null);
    }
}
