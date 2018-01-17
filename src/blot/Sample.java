package blot;

import game.Kart;
import game.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Sample {

    @FXML
    private Label ez;

    @FXML
    Button button;


    @FXML
    void bajanel() {
        String s = "";
        Blot blot = new Blot();
        Player player[] = blot.bajanel();
        for (int i = 0; i < 4; i++) {
            for (Kart kart : player[i].getKarter()) {
                s += kart + " ";
            }
            s += "\n";
        }

        ez.setText(s);
    }

}
