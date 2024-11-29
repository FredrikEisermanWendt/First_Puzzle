package print;

import java.util.*;

public class ColorText {

    private final List<String> listOfHackathon = new ArrayList<>();

    public ColorText() {
        listOfHackathon.add("\u001B[31m HACKATHON 2024");
        listOfHackathon.add("\u001B[32m HACKATHON 2024");
        listOfHackathon.add("\u001B[33m HACKATHON 2024");
        listOfHackathon.add("\u001B[34m HACKATHON 2024");
        listOfHackathon.add("\u001B[35m HACKATHON 2024");
        listOfHackathon.add("\u001B[36m HACKATHON 2024");
        listOfHackathon.add("\u001B[37m HACKATHON 2024");
    }

    public List<String> getListOfHackathon(){
        return listOfHackathon;
    }

    public void sleepOneSecond() {
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println("HACKATHON!!!!");
        }
    }
}

