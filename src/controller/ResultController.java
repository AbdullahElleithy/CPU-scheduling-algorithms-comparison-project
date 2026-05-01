package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Result;

public class ResultController {

    @FXML private Label leftTitle;
    @FXML private Label rightTitle;

    public static void showResults(Result r1, Result r2) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    ResultController.class.getResource("/view/result.fxml"));

            Parent root = loader.load();

            ResultController controller = loader.getController();
            controller.setData(r1, r2);

            Stage stage = new Stage();
            stage.setTitle("Results Comparison");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setData(Result left, Result right) {

        leftTitle.setText(left.algorithmName);
        rightTitle.setText(right.algorithmName);
    }
}