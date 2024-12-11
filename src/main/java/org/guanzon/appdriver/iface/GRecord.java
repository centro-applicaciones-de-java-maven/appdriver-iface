package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GRecord {
    int getEditMode();
    void setRecordStatus(String fsValue);
    JSONObject newRecord();
    JSONObject openRecord(String fsValue);
    JSONObject updateRecord();
    JSONObject saveRecord();
    JSONObject deleteRecord();
    JSONObject deactivateRecord();
    JSONObject activateRecord();
    JSONObject isEntryOkay();
    JSONObject searchRecord(String fsValue, boolean fbByCode);
    Object getModel();
    String getSQ_Browse();
}
