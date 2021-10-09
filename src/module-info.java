module LoginPageFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires opencv;
	
	opens application to javafx.graphics, javafx.fxml;
}
