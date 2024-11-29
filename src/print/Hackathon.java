package print;

public class Hackathon {
    public static void party() {
        ColorText text = new ColorText();
        for (int i = 0; i < 100; i++){
            for (String color : text.getListOfHackathon()){
                System.out.print(color);
                text.sleepOneSecond();
                System.out.print("\r");
            }
        }
    }
}
