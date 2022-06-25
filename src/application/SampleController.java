package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML
	private Button btnVerifLettre;
	
	@FXML
	private TextArea TAlettresFausses;
	
	@FXML
	private Label car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, LblErreurs;
	
	@FXML
	private TextField TFlettre;
	
	private int erreurs = 7;
	
	@FXML
	protected void VerifierLettre(ActionEvent event) {
		
		
		
		switch(TFlettre.getText()) {
		
		case "o":
			car1.setText("O");
			break;
			
		case "r":
			car2.setText("R");
			car10.setText("R");
			break;
			
		case "d":
			car3.setText("D");
			break;
			
		case "i":
			car4.setText("I");
			break;
			
		case "n":
			car5.setText("N");
			break;
			
		case "a":
			car6.setText("A");
			break;
			
		case "t":
			car7.setText("T");
			break;
			
		case "e":
			car8.setText("E");
			break;
			
		case "u":
			car9.setText("U");
			break;
		
		default:
			erreurs -= 1;
			LblErreurs.setText(String.valueOf(erreurs));
			TAlettresFausses.appendText(TFlettre.getText());
			
		}
		if(erreurs == 0) {
			showAlertWithHeaderText();
		}
    }
	
	private void showAlertWithHeaderText() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("PERDU !!!");
		alert.setContentText("Vous avez perdu, relancez le programme pour recommencer");

		alert.showAndWait();
	}
}
