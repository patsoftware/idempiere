/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.idempiere.webservices.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for WS_WebServiceFieldOutput
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_WS_WebServiceFieldOutput 
{

    /** TableName=WS_WebServiceFieldOutput */
    public static final String Table_Name = "WS_WebServiceFieldOutput";

    /** AD_Table_ID=53167 */
    public static final int Table_ID = 53167;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Column_ID */
    public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

	/** Set Column.
	  * Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID);

	/** Get Column.
	  * Column in the table
	  */
	public int getAD_Column_ID();

	public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException;

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name WS_WebServiceFieldOutput_ID */
    public static final String COLUMNNAME_WS_WebServiceFieldOutput_ID = "WS_WebServiceFieldOutput_ID";

	/** Set Web Service Field Output	  */
	public void setWS_WebServiceFieldOutput_ID (int WS_WebServiceFieldOutput_ID);

	/** Get Web Service Field Output	  */
	public int getWS_WebServiceFieldOutput_ID();

    /** Column name WS_WebServiceFieldOutput_UU */
    public static final String COLUMNNAME_WS_WebServiceFieldOutput_UU = "WS_WebServiceFieldOutput_UU";

	/** Set WS_WebServiceFieldOutput_UU	  */
	public void setWS_WebServiceFieldOutput_UU (String WS_WebServiceFieldOutput_UU);

	/** Get WS_WebServiceFieldOutput_UU	  */
	public String getWS_WebServiceFieldOutput_UU();

    /** Column name WS_WebServiceType_ID */
    public static final String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

	/** Set Web Service Type	  */
	public void setWS_WebServiceType_ID (int WS_WebServiceType_ID);

	/** Get Web Service Type	  */
	public int getWS_WebServiceType_ID();

	public I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
