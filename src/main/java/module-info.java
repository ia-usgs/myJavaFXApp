module com.example.myjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                requires org.kordamp.ikonli.javafx;
                
    opens com.example.myjavafxapp to javafx.fxml;
    exports com.example.myjavafxapp;
}