module io.dbc.github.sanraksha {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.sanraksha to javafx.fxml;
    exports io.dbc.github.sanraksha;
}