package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GTransaction {
    JSONObject newTransaction();
    JSONObject openTransaction(String fsValue);
    JSONObject updateTransaction();
    JSONObject saveTransaction();
    
    JSONObject deleteTransaction(String fsValue);
    JSONObject closeTransaction(String fsValue);
    JSONObject postTransaction(String fsValue);
    JSONObject voidTransaction(String fsValue);
    JSONObject cancelTransaction(String fsValue);

    JSONObject searchWithCondition(String fsCondition);
    JSONObject searchTransaction(String fsIndex, String fsValue, boolean fbIsExact);
    JSONObject searchMaster(String fsIndex, String fsValue, boolean fbIsExact);
    JSONObject searchMaster(int fnIndex, String fsValue, boolean fbIsExact);
    
    Object getMasterModel();
    JSONObject setMaster(int fnCol, Object foData);
    JSONObject setMaster(String fsCol, Object foData);
    
    int getEditMode();
    void setTransactionStatus(String fsValue);
}
