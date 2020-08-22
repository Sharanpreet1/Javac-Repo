package lesson37.java;
import java.util.ArrayList;

public class ArrayPlaylist{
    public static void main(String[] args) {
        ArrayList<String> gymPlaylist = new ArrayList<String>();

        gymPlaylist.add("Sneakers Pimps -Six Underground");
        gymPlaylist.add("A Tribe Called Quest - Electric Relaxation");
        gymPlaylist.add("Buena Vista Social Club - Murmullo");

        gymPlaylist.add("MF DOOM - Guinnesses");
        gymPlaylist.add("Radiohead - Idioteque");

        gymPlaylist.add("Gramatik - Good Evening, Mr. Hitchcock");
        gymPlaylist.add("Jean Grae - Threats");

        System.out.println(gymPlaylist);
        System.out.println(gymPlaylist.size());

        int indexOfA= gymPlaylist.indexOf("Buena Vista Social Club - Murmullo");
        int indexOfB = gymPlaylist.indexOf("Radiohead - Idioteque");

        String tempA = "Buena Vista Social Club - Murmullo";

        gymPlaylist.set(indexOfA,"A Tribe Called Quest - Electric Relaxation");
        gymPlaylist.set(indexOfB,tempA);
        System.out.println(gymPlaylist);
        System.out.println(gymPlaylist.indexOf("Buena Vista Social Club - Murmullo"));






    }
    }

