package javafx_example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class Controller {
    @FXML
    private Button interface1_btn;

    @FXML
    private AnchorPane interface1_form;

    @FXML
    private Button interface2_btn;

    @FXML
    private AnchorPane interface2_form;

    @FXML
    private Button interface3_btn;

    @FXML
    private AnchorPane interface3_form;

    @FXML
    private Button interface4_btn;

    @FXML
    private AnchorPane interface4_form;

    public void switchForm(javafx.event.ActionEvent event) {

            if (event.getSource()== interface1_btn) {
                interface1_form.setVisible(true);
                interface2_form.setVisible(false);
                interface3_form.setVisible(false);
                interface4_form.setVisible(false);
            } else if (event.getSource()== interface2_btn) {
                interface1_form.setVisible(false);
                interface2_form.setVisible(true);
                interface3_form.setVisible(false);
                interface4_form.setVisible(false);
            } else if (event.getSource()== interface3_btn) {
                interface1_form.setVisible(false);
                interface2_form.setVisible(false);
                interface3_form.setVisible(true);
                interface4_form.setVisible(false);
            } else if (event.getSource()== interface4_btn) {
                interface1_form.setVisible(false);
                interface2_form.setVisible(false);
                interface3_form.setVisible(false);
                interface4_form.setVisible(true);
            }
    }
}