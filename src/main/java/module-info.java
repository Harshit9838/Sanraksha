module io.dbc.github.sanraksha {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.sanraksha to javafx.fxml;
    exports io.dbc.github.sanraksha;
}