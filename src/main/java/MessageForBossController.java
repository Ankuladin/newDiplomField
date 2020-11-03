import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.time.LocalDateTime;
public class MessageForBossController {
    private Main mainApp;
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    private int numbField = 0;
    @FXML
    private TextField TF1;
    LocalDateTime currLD;
    public int getNumbField() {
        return numbField;
    }
    public void setNumbField(int numbField) {
        this.numbField = numbField;
    }
    @FXML
    private void clickSend(ActionEvent event) {
        try {
            /*
            String datePlace = "";
            currLD = LocalDateTime.now();
            switch (numbField) {
                case 1: datePlace = "цех 1 " + currLD.toString() + " ";
                break;
                case 2: datePlace = "цех 2 " + currLD.toString() + " ";
                break;
                case 3: datePlace = "цех 3 " + currLD.toString() + " ";
                break;
            }
            String k = datePlace + " : " + TF1.getText();
            */
            String k = TF1.getText();
            mainApp.oos.writeObject(k);
            mainApp.writer.flush();
        } catch (Exception ex) {
        }
    }
}
