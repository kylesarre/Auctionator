package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeMenu implements Initializable
{
	private Main application;
	private User loggedUser;

	@FXML
	private Label welcomeText;
	@FXML
	private Button exitButton;

	public void setApp(Main application){
        this.application = application;
        loggedUser = application.getLoggedUser();
        welcomeText.setText("Welcome, " + loggedUser.getCompany());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
	}

	@FXML
	protected void logout(ActionEvent event)
	{
		application.logout();
	}

	@FXML
	protected void exitApplication(ActionEvent event)
	{
		Stage stage = (Stage) exitButton.getScene().getWindow();
		stage.close();
	}

	@FXML
	protected void gotoActiveProfile() throws IOException
	{
		application.gotoProfilePage();
	}

	@FXML
	protected void gotoAuctionList() throws IOException
	{
		application.gotoAuctionList();
	}
}
