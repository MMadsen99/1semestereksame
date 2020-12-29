package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Button GlasurButton;

    @FXML
    private Button CitronTeButton;

    @FXML
    private TextArea IngTextArea;

    @FXML
    private TextArea FremTextArea;

    @FXML
    private ImageView BilledeImageView;

    Image glasur = new Image("/Image/glasur.jpg");
    Image citron = new Image("/Image/citron.jpg");

    public void citronTe(){

        BilledeImageView.setImage(citron);
        FremTextArea.clear();
        IngTextArea.clear();
        Opskrift opskrift = new Opskrift("Citron te","skær en citron ud i både og lig dem i kogende vand, lad citronen ligge i vandt i 10 min",1,10);
        FremTextArea.appendText(opskrift.fremgangsmaade);

        IngTextArea.appendText("- Kogende vand \n- Citron");
    }
    public void glasur(){
        BilledeImageView.setImage(glasur);
        FremTextArea.clear();
        IngTextArea.clear();
        Opskrift glasurOpskrift = new Opskrift("Glasur","Bland vand og flormelis indtil det får den konsistens du ville have din glasur i",1,5);
        FremTextArea.appendText(glasurOpskrift.fremgangsmaade);

        for (int i = 0; i < glasurOpskrift.ingredienser.size(); i++) {



        }
    }
}
