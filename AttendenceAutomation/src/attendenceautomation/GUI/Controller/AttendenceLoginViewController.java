/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendenceautomation.GUI.Controller;

import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asvør
 */
public class AttendenceLoginViewController implements Initializable
{

    @FXML
    private TextField txtUserName;
    @FXML
    private Button btnLogin;
    @FXML
    private JFXPasswordField txtPassword;

    public AttendenceLoginViewController() throws IOException
    {

    }

    //handles student login
    private void handleStudentLogin() throws IOException
    {
<<<<<<< HEAD
=======

        if (txtUserName.getText().toLowerCase().equals("birger@easv365.com") && txtPassword.getText().toLowerCase().equals("birger365"))
        {
>>>>>>> parent of 84b0b6c... Revert "personDbDAO.. halfway there"
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendenceautomation/GUI/View/RootLayout.fxml"));
            FXMLLoader loader = new FXMLLoader();

            Stage stage = new Stage();
            stage.setScene(new Scene(pane));

            stage.show();

            //Close this window
            Stage currentWindows = (Stage) btnLogin.getScene().getWindow();
            currentWindows.close();
<<<<<<< HEAD
        
=======
        }

        if (!txtUserName.getText().toLowerCase().equals("birger@easv365.com") || !txtPassword.getText().toLowerCase().equals("birger365"))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect user name or password");
            alert.showAndWait();
        }
    }

    private void handleTeacherLogin() throws IOException
    {
        //handles teacher login
        if (txtUserName.getText().toLowerCase().equals("peter@easv365.com") && txtPassword.getText().toLowerCase().equals("peter365"))
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendenceautomation/GUI/View/teacherMainView.fxml"));
            FXMLLoader loader = new FXMLLoader();

            Stage stage = new Stage();
            stage.setScene(new Scene(pane));

            stage.show();

            //Close this window
            Stage currentWindows = (Stage) btnLogin.getScene().getWindow();
            currentWindows.close();
        }

        if (!txtUserName.getText().toLowerCase().equals("peter@easv365.com") || !txtPassword.getText().toLowerCase().equals("peter365"))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect user name or password");
            alert.showAndWait();
        }
>>>>>>> parent of 84b0b6c... Revert "personDbDAO.. halfway there"
    }

    @FXML
    private void handleLogin(ActionEvent event) throws IOException, InterruptedException
    {
<<<<<<< HEAD
        if (txtUserName.getText().toLowerCase().equals("") && txtPassword.getText().toLowerCase().equals(""))
        {
            handleStudentLogin();
            return;
        }
        if (txtUserName.getText().toLowerCase().equals(" ") && txtPassword.getText().toLowerCase().equals(""))
        {
            handleTeacherLogin();
            return;
        }
        else
        {
            
            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect user name or password");
            alert.showAndWait();
        }
    }

    private void handleTeacherLogin() throws IOException
    {
        //handles teacher login
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendenceautomation/GUI/View/teacherMainView.fxml"));
            FXMLLoader loader = new FXMLLoader();

            Stage stage = new Stage();
            stage.setScene(new Scene(pane));

            stage.show();

            //Close this window
            Stage currentWindows = (Stage) btnLogin.getScene().getWindow();
            currentWindows.close();
        

=======
        handleTeacherLogin();
        handleStudentLogin();
>>>>>>> parent of 84b0b6c... Revert "personDbDAO.. halfway there"
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

}
