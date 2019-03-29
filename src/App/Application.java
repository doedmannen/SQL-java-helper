package App;

import App.helpers.database.SQLHelper;

public class Application {
    SQLHelper sqlHelper;
    Application(){
        sqlHelper = new SQLHelper("localhost", "Europe/Stockholm", "test_db", "test", "password123");
    }
}
