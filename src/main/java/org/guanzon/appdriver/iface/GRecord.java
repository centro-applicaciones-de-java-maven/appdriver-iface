package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GRecord {
    int getEditMode();
    void setRecordStatus(String recordStatus);
    JSONObject newRecord();
    JSONObject openRecord(String Id);
    JSONObject updateRecord();
    JSONObject saveRecord();
    JSONObject deleteRecord();
    JSONObject deactivateRecord();
    JSONObject activateRecord();
    JSONObject isEntryOkay();
    JSONObject searchRecord(String value, boolean byCode);
    Object getModel();
    String getSQ_Browse();
}
