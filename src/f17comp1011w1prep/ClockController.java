package f17comp1011w1prep;

import java.lang.NumberFormatException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class ClockController implements Initializable {
    private @FXML Label standardTime;
    private @FXML Label militaryTime;
    private Time1 time = new Time1();
    private @FXML Spinner hoursSpinner;
    private @FXML Spinner minutesSpinner;
    private @FXML Spinner secondsSpinner;
        
    /**
     * If the UpdateTime button is pressed, it should update the 
     * time1 object and display the result in the timeDisplay
     */
    public void updateTimeButtonPushed()
    {        
        
        try
        {
            int hours = (int) hoursSpinner.getValue();
            int minutes =  (int) minutesSpinner.getValue();
            int seconds = (int) secondsSpinner.getValue();
            
            time.setTime(hours, minutes, seconds);
            standardTime.setText(time.toString());
            militaryTime.setText(time.toUniversalString());
        }
        catch (Exception e)
        {                           
            System.err.printf("%s%n", e.getMessage());
        }
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        SpinnerValueFactory<Integer> hoursValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,23,0);
        SpinnerValueFactory<Integer> minValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59,0);
        SpinnerValueFactory<Integer> secValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59,0);
        
        hoursSpinner.setValueFactory(hoursValueFactory);
        minutesSpinner.setValueFactory(minValueFactory);
        secondsSpinner.setValueFactory(secValueFactory);   
        
        hoursSpinner.setEditable(true);
    }    
    
}
