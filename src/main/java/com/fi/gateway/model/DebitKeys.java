package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class DebitKeys {

	@XmlElement
	 private String DebitId;

	@XmlElement
	private AcctKeys AcctKeys;

	    public String getDebitId ()
	    {
	        return DebitId;
	    }

	    public void setDebitId (String DebitId)
	    {
	        this.DebitId = DebitId;
	    }

	    public AcctKeys getAcctKeys ()
	    {
	        return AcctKeys;
	    }

	    public void setAcctKeys (AcctKeys AcctKeys)
	    {
	        this.AcctKeys = AcctKeys;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [DebitId = "+DebitId+", AcctKeys = "+AcctKeys+"]";
	    }
}
