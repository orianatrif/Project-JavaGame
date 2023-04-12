import controller.ControllerGame;
import model.Game;
import view.*;

public class Main {
    public static void main(String[] args) {
        int tokens=0;
        int badges = 0;
         int rank = 0;


        Game game = new Game("Puzzle", tokens, badges, rank);

        MainView viewM = new MainView();
        ViewG1 viewG1 = new ViewG1();
        ViewG2 viewG2 = new ViewG2();


        ControllerGame controllerGame = new ControllerGame(game, viewM, viewG1, viewG2);
    }
}
