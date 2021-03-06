// .//GEN-BEGIN:1_be
/******************************************************
 * Code Generated From JAFFA Framework Default Pattern
 * 
 * The JAFFA Project can be found at http://jaffa.sourceforge.net
 * and is available under the Lesser GNU Public License
 ******************************************************/ 
package org.jaffa.modules.printing.domain;

import org.jaffa.metadata.*;
import java.util.*;

// .//GEN-END:1_be
// Add additional imports//GEN-FIRST:imports




// .//GEN-LAST:imports
// .//GEN-BEGIN:2_be
/** This class has the meta information for the OutputCommand persistent class.
 */
public class OutputCommandMeta {
    
    // domain-object class name
    private static String m_name = "org.jaffa.modules.printing.domain.OutputCommand";

    // token to be used for getting the label for the domain-object
    private static String m_labelToken = "[label.Jaffa.Printing.OutputCommand]";



    // Field constants
    /** A constant to identity the OutputCommandId field.*/
    public static final String OUTPUT_COMMAND_ID = "OutputCommandId";
    /** A constant to identity the OutputType field.*/
    public static final String OUTPUT_TYPE = "OutputType";
    /** A constant to identity the SequenceNo field.*/
    public static final String SEQUENCE_NO = "SequenceNo";
    /** A constant to identity the OsPattern field.*/
    public static final String OS_PATTERN = "OsPattern";
    /** A constant to identity the CommandLine field.*/
    public static final String COMMAND_LINE = "CommandLine";
    /** A constant to identity the CreatedOn field.*/
    public static final String CREATED_ON = "CreatedOn";
    /** A constant to identity the CreatedBy field.*/
    public static final String CREATED_BY = "CreatedBy";
    /** A constant to identity the LastChangedOn field.*/
    public static final String LAST_CHANGED_ON = "LastChangedOn";
    /** A constant to identity the LastChangedBy field.*/
    public static final String LAST_CHANGED_BY = "LastChangedBy";


    // Meta Data Definitions

    /** A constant which holds the meta information for the OutputCommandId field.*/
    public static final FieldMetaData META_OUTPUT_COMMAND_ID = new IntegerFieldMetaData(OUTPUT_COMMAND_ID, "[label.Jaffa.Printing.OutputCommand.OutputCommandId]", Boolean.FALSE, null, null, null, new Integer(10));

    /** A constant which holds the meta information for the OutputType field.*/
    public static final FieldMetaData META_OUTPUT_TYPE = new StringFieldMetaData(OUTPUT_TYPE, "[label.Jaffa.Printing.PrinterOutputType.OutputType]", Boolean.TRUE, null, new Integer(20), FieldMetaData.UPPER_CASE);

    /** A constant which holds the meta information for the SequenceNo field.*/
    public static final FieldMetaData META_SEQUENCE_NO = new IntegerFieldMetaData(SEQUENCE_NO, "[label.Jaffa.Printing.OutputCommand.SequenceNo]", Boolean.TRUE, null, null, null, new Integer(10));

    /** A constant which holds the meta information for the OsPattern field.*/
    public static final FieldMetaData META_OS_PATTERN = new StringFieldMetaData(OS_PATTERN, "[label.Jaffa.Printing.OutputCommand.OsPattern]", Boolean.TRUE, null, new Integer(255), FieldMetaData.MIXED_CASE);

    /** A constant which holds the meta information for the CommandLine field.*/
    public static final FieldMetaData META_COMMAND_LINE = new StringFieldMetaData(COMMAND_LINE, "[label.Jaffa.Printing.OutputCommand.CommandLine]", Boolean.TRUE, null, new Integer(255), FieldMetaData.MIXED_CASE);

    /** A constant which holds the meta information for the CreatedOn field.*/
    public static final FieldMetaData META_CREATED_ON = new DateTimeFieldMetaData(CREATED_ON, "[label.Jaffa.Common.CreatedOn]", Boolean.FALSE, null, null, null);

    /** A constant which holds the meta information for the CreatedBy field.*/
    public static final FieldMetaData META_CREATED_BY = new StringFieldMetaData(CREATED_BY, "[label.Jaffa.Common.CreatedBy]", Boolean.FALSE, null, new Integer(20), FieldMetaData.UPPER_CASE);

    /** A constant which holds the meta information for the LastChangedOn field.*/
    public static final FieldMetaData META_LAST_CHANGED_ON = new DateTimeFieldMetaData(LAST_CHANGED_ON, "[label.Jaffa.Common.LastChangedOn]", Boolean.FALSE, null, null, null);

    /** A constant which holds the meta information for the LastChangedBy field.*/
    public static final FieldMetaData META_LAST_CHANGED_BY = new StringFieldMetaData(LAST_CHANGED_BY, "[label.Jaffa.Common.LastChangedBy]", Boolean.FALSE, null, new Integer(20), FieldMetaData.UPPER_CASE);



    // Map of FieldConstants + MetaDataDefinitions
    private static Map m_fieldMap = new HashMap();
    static {
        m_fieldMap.put(OUTPUT_COMMAND_ID, META_OUTPUT_COMMAND_ID);
        m_fieldMap.put(OUTPUT_TYPE, META_OUTPUT_TYPE);
        m_fieldMap.put(SEQUENCE_NO, META_SEQUENCE_NO);
        m_fieldMap.put(OS_PATTERN, META_OS_PATTERN);
        m_fieldMap.put(COMMAND_LINE, META_COMMAND_LINE);
        m_fieldMap.put(CREATED_ON, META_CREATED_ON);
        m_fieldMap.put(CREATED_BY, META_CREATED_BY);
        m_fieldMap.put(LAST_CHANGED_ON, META_LAST_CHANGED_ON);
        m_fieldMap.put(LAST_CHANGED_BY, META_LAST_CHANGED_BY);
    }
    
    // List of MetaDataDefinitions for key fields
    private static List m_keyFields = new LinkedList();
    static {
        m_keyFields.add(META_OUTPUT_COMMAND_ID);
    }
    
    // List of MetaDataDefinitions for mandatory fields
    private static List m_mandatoryFields = new LinkedList();
    static {
        m_mandatoryFields.add(META_OUTPUT_TYPE);
        m_mandatoryFields.add(META_SEQUENCE_NO);
        m_mandatoryFields.add(META_OS_PATTERN);
        m_mandatoryFields.add(META_COMMAND_LINE);
    }
    
    
    
    
    
    /** Returns the name of the persistent class.
     * @return the name of the persistent class.
     */
    public static String getName() {
        return m_name;
    }
    
    /** Getter for property labelToken.
     * @return Value of property labelToken.
     */
    public static String getLabelToken() {
        return m_labelToken;
    }
    
    /** This returns an array of all the fields of the persistent class.
     * @return an array of all the fields of the persistent class.
     */
    public static String[] getAttributes() {
        return DomainMetaDataHelper.getAttributes(m_fieldMap);
    }
    
    /** This returns an array of meta information for all the fields of the persistent class.
     * @return an array of meta information for all the fields of the persistent class.
     */
    public static FieldMetaData[] getFieldMetaData() {
        return DomainMetaDataHelper.getFieldMetaData(m_fieldMap);
    }
    
    /** This returns meta information for the input field.
     * @param fieldName the field name.
     * @return meta information for the input field.
     */
    public static FieldMetaData getFieldMetaData(String fieldName) {
        return DomainMetaDataHelper.getFieldMetaData(m_fieldMap, fieldName);
    }

    /** This returns an array of meta information for all the key fields of the persistent class.
     * @return an array of meta information for all the key fields of the persistent class.
     */
    public static FieldMetaData[] getKeyFields() {
        return (FieldMetaData[]) m_keyFields.toArray(new FieldMetaData[0]);
    }
    
    /** This returns an array of meta information for all the mandatory fields of the persistent class.
     * @return an array of meta information for all the mandatory fields of the persistent class.
     */
    public static FieldMetaData[] getMandatoryFields() {
        return (FieldMetaData[]) m_mandatoryFields.toArray(new FieldMetaData[0]);
    }
    
// .//GEN-END:2_be
// All the custom code goes here//GEN-FIRST:custom






// .//GEN-LAST:custom
}

