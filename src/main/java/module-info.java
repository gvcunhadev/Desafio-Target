module gvcunhadev.desafiotarget {
    requires javafx.controls;
    requires javafx.fxml;


    opens gvcunhadev.desafiotarget to javafx.fxml;
    exports gvcunhadev.desafiotarget;
}