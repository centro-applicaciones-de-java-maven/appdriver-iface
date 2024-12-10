package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

/**
 * Standard template for record entry and modifications.
 *  
 * @author Marlon Sayson
 * @author Michael Cuison
 * @since April 8, 2024
 */
public interface GRecord {
    /**
     * Get the edit mode of the transaction.
     * 
     * @return org.guanzon.appdriver.constant.EditMode
     */
    int getEditMode();
    
    /**
     * Sets the status of the record to search.
     * 
     * @param fsValue - org.guanzon.appdriver.constant.RecordStat 
     */
    void setRecordStatus(String fsValue);
    
    /**
     * Creates new record.
     * 
     * @return result as success/error
     */
    JSONObject newRecord();
    
    /**
     * Loads an existing record.
     * 
     * @param fsValue - record primary key value
     * @return result as success/error
     */
    JSONObject openRecord(String fsValue);
    
    /**
     * Set the edit mode of the record to update.
     * 
     * @return result as success/error
     */
    JSONObject updateRecord();
    
    /**
     * Saves the record.
     * 
     * @return result as success/error
     */
    JSONObject saveRecord();
    
    /**
     * Deletes a record.
     * 
     * @return result as success/error
     */
    JSONObject deleteRecord();
    
    /**
     * Set record status to inactive.
     * 
     * @return result as success/error
     */
    JSONObject deactivateRecord();
    
    /**
     * Set record status to active.
     * 
     * @return result as success/error
     */
    JSONObject activateRecord();
    
    /**
     * Validates record before saving
     * 
     * @return result as success/error
     */
    JSONObject isEntryOkay();
    
    /**
     * Searches a record.
     * @param fsValue - search value
     * @param fbByCode - true if will use primary key to search
     * @return result as success/error
     */
    JSONObject searchRecord(String fsValue, boolean fbByCode);
    
    /**
     * Gets the model entity object
     * 
     * @return Object
     */
    Object getModel();
    
    /**
     * Gets the SQL query for browsing record
     * 
     * @return String
     */
    String getSQ_Browse();
}
