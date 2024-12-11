package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GEntity {
    String getColumn(int fnValue);
    int getColumn(String fsValue);
    int getColumnCount();
    int getEditMode();
    String getTable();
    Object getValue(int fnColumn);
    Object getValue(String fsColumn);
    JSONObject setValue(int fnColumn, Object foValue);
    JSONObject setValue(String fsColumn, Object foValue);
    JSONObject newRecord();
    JSONObject openRecord(String fsCondition);
    JSONObject updateRecord();
    JSONObject saveRecord();
    void list();
}
