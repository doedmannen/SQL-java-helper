package App;

import App.helpers.database.SQLHelper;
import App.helpers.database.enums.SQLTypes;
import App.models.TestObject;

public final class QueryInitializer {
    private QueryInitializer(){}

    static void initQueries(SQLHelper sqlHelper){
        sqlHelper.createQuery("key1", "SELECT * FROM `random_table` WHERE id > ? AND `some_name` = ?",
                new SQLTypes[]{SQLTypes.LONG, SQLTypes.STRING}, TestObject.class);
        sqlHelper.createQuery("key2", "UPDATE `random_table` SET `some_name` = ? WHERE id > ?",
                new SQLTypes[]{SQLTypes.STRING, SQLTypes.LONG});
        sqlHelper.createQuery("key3", "CALL some_procedure()");
    }
}
