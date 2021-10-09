package application;

import java.io.IOException;
import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerConverter {
		@FXML
		TextField tempInput;
		@FXML
		Label result;
		public void convert2Celsius(ActionEvent e) throws IOException{
			int temp = Integer.parseInt(tempInput.getText());
			DecimalFormat df = new DecimalFormat("##.00");
			double tempInCelsius = Math.round((temp - 32)*0.5556);
			String tempInCelsiusString = df.format(tempInCelsius); 
			result.setText(tempInCelsius + " Celsius degrees");
			//System.out.println("Temperature in Celsius: " + tempInCelsiusString + " degrees");
		}
		public void convert2Fahrenheit(ActionEvent e) throws IOException{
			int temp = Integer.parseInt(tempInput.getText());
			double tempInFahrenheit = temp * 1.8 + 32;
			result.setText(String.valueOf(tempInFahrenheit) + " Fahrenheit degrees");
			//System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit + " degrees");
		}


}
