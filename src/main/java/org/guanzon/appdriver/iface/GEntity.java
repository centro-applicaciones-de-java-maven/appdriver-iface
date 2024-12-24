package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GEntity {
    String getColumn(int columnIndex);
    int getColumn(String columnName);
    int getColumnCount();
    int getEditMode();
    String getTable();
    Object getValue(int colmunIndex);
    Object getValue(String columnName);
    JSONObject setValue(int columnIndex, Object value);
    JSONObject setValue(String columnName, Object value);
    JSONObject newRecord();
    JSONObject openRecord(String Id);
    JSONObject openRecord(String Id1, Object Id2);
    JSONObject openRecord(String Id1, Object Id2, Object Id3);
    JSONObject openRecord(String Id1, Object Id2, Object Id3, Object Id4);
    JSONObject openRecord(String Id1, Object Id2, Object Id3, Object Id4, Object Id5);
    JSONObject updateRecord();
    JSONObject saveRecord();
    void list();
}
