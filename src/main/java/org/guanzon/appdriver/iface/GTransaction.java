package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GTransaction {
    JSONObject newTransaction();
    JSONObject openTransaction(String transactionNo);
    JSONObject updateTransaction();
    JSONObject saveTransaction();
    
    JSONObject deleteTransaction();
    JSONObject deleteTransaction(String transactionNo);
    
    JSONObject closeTransaction();
    JSONObject closeTransaction(String transactionNo);
    
    JSONObject postTransaction();
    JSONObject postTransaction(String transactionNo);
    
    JSONObject voidTransaction();
    JSONObject voidTransaction(String transactionNo);
    
    JSONObject cancelTransaction();
    JSONObject cancelTransaction(String transactionNo);

    JSONObject searchTransaction(String value, boolean byCode);
    
    Object getMaster();
        
    int getEditMode();
    void setTransactionStatus(String fsValue);
}
