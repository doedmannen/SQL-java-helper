package App.models;

import App.helpers.database.annotations.DBCol;

public class TestObject {
    @DBCol
    long id;

    @DBCol
    String name;

    @DBCol("other_table_name")
    String thisObjectName;
}
