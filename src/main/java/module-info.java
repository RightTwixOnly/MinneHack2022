module pwned.minnehack {
    requires javafx.controls;
    requires javafx.fxml;


    opens pwned.minnehack to javafx.fxml;
    exports pwned.minnehack;
}