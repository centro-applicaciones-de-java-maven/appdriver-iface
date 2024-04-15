package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

/**
 * Standard template for Guanzon Entities.
 *  
 * @author Marlon Sayson
 * @author Michael Cuison
 * @since April 8, 2024
 */
public interface GEntity {
    /**
     * Gets the column index name.
     * @param fnValue - column index number
     * @return column index name
     */
    String getColumn(int fnValue);
    
    /**
     * Gets the column index number.
     * @param fsValue - column index name
     * @return column index number
     */
    int getColumn(String fsValue);
    
    /**
     * Gets the total number of column.
     * @return total number of column
     */
    int getColumnCount();
    
    /**
     * Gets the edit mode of the record.
     * @return edit mode
     */
    int getEditMode();
    
    /**
     * Gets the table name.
     * @return table name
     */
    String getTable();
    
    /**
     * Gets the value of a column index number.
     * 
     * @param fnColumn - column index number
     * @return object value
     */
    Object getValue(int fnColumn);
    
    /**
     * Gets the value of a column index name.
     * 
     * @param fsColumn - column index name
     * @return object value
     */
    Object getValue(String fsColumn);
    
    /**
     * Sets column value.
     * 
     * @param fnColumn - column index number
     * @param foValue - value
     * @return result as success/failed
     */
    JSONObject setValue(int fnColumn, Object foValue);
    
    /**
     * Sets column value.
     * 
     * @param fsColumn - column index name
     * @param foValue - value
     * @return result as success/failed
     */
    JSONObject setValue(String fsColumn, Object foValue);
    
    /**
     * Set the edit mode of the entity to new.
     * 
     * @return result as success/failed
     */
    JSONObject newRecord();
    
    /**
     * Opens a record.
     * 
     * @param fsCondition - filter values
     * @return result as success/failed
     */
    JSONObject openRecord(String fsCondition);
    
    /**
     * Save the entity.
     * 
     * @return result as success/failed
     */
    JSONObject saveRecord();
    
    /**
     * Prints all the public methods used<br>
     * and prints the column names of this entity.
     */
    void list();
}
