package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GEntity {
    public String getColumn(int fnValue);
    public int getColumn(String fsValue);
    public int getColumnCount();
    public String getTable();
    public Object getValue(int fnColumn);
    public Object getValue(String fsColumn);
    public JSONObject setValue(int fnColumn, Object foValue);
    public JSONObject setValue(String fsColumn, Object foValue);
    public JSONObject newRecord();
    public JSONObject openRecord(String fsValue);
    public JSONObject saveRecord();
    
    public void list();
}
