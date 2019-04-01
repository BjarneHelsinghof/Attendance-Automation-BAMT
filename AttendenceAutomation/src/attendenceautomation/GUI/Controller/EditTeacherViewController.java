/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendenceautomation.GUI.Controller;

import attendenceautomation.BE.Teacher;
import attendenceautomation.GUI.Model.AAModel;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * FXML Controller class
 *
 * @author Asvør
 */
public class EditTeacherViewController implements Initializable
{

    @FXML
    private JFXTextField txtFirstName;
    @FXML
    private JFXTextField txtLastName;
    @FXML
    private JFXTextField txtEmail;

    private Teacher chosenTeacher;
    
    AAModel aaModel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    public void setAaModel(AAModel aaModel)
    {
        this.aaModel = aaModel;
    }

    @FXML
    private void btnEditTeacher(ActionEvent event)
    {
        if (txtFirstName.getText().length() == 0 || txtLastName.getText().length() == 0 || txtEmail.getText().length() == 0)
        {
            Alert alert = new Alert (Alert.AlertType.CONFIRMATION, "You have to fill out nall fields!", ButtonType.OK);
            alert.showAndWait();
            return;
        }

         String fName = this.txtFirstName.getText();
         String lName = this.txtLastName.getText();
         String email = this.txtEmail.getText();
         
         aaModel.editPerson(fName, lName, email, chosenTeacher.getId());
    }

    public void setChosenTeacher(Teacher chosenTeacher)
    {
        this.chosenTeacher = chosenTeacher;
    }
    
    
    
}