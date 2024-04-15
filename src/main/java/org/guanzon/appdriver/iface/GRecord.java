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
     * Sets record value.
     * 
     * @param fnCol - column index number
     * @param foData - value
     * @return result as success/error
     */
    JSONObject setMaster(int fnCol, Object foData);
    
    /**
     * Sets record value.
     * 
     * @param fsCol - column index name
     * @param foData - value
     * @return result as success/failed
     */
    JSONObject setMaster(String fsCol, Object foData);
    
    /**
     * Gets the value of a column.
     * 
     * @param fnCol - column index number
     * @return object value
     */
    Object getMaster(int fnCol);
    
    /**
     * Gets the value of a column.
     * 
     * @param fsCol - column index name
     * @return object value
     */
    Object getMaster(String fsCol);

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
     * @param fsValue - record primary key value
     * @return result as success/error
     */
    JSONObject deleteRecord(String fsValue);
    
    /**
     * Set record status to inactive.
     * 
     * @param fsValue - record primary key value
     * @return result as success/error
     */
    JSONObject deactivateRecord(String fsValue);
    
    /**
     * Set record status to active.
     * 
     * @param fsValue - record primary key value
     * @return result as success/error
     */
    JSONObject activateRecord(String fsValue);
    
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
}
