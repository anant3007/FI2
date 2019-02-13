package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class AcctRef {

	@XmlElement
	 private String AcctId;

	@XmlElement
	    private String AcctType;

	@XmlElement
	    private String FIIdent;

	@XmlElement
	private String FIIdentType;

	    public String getAcctId ()
	    {
	        return AcctId;
	    }

	    public void setAcctId (String AcctId)
	    {
	        this.AcctId = AcctId;
	    }

	    public String getAcctType ()
	    {
	        return AcctType;
	    }

	    public void setAcctType (String AcctType)
	    {
	        this.AcctType = AcctType;
	    }

	    public String getFIIdent ()
	    {
	        return FIIdent;
	    }

	    public void setFIIdent (String FIIdent)
	    {
	        this.FIIdent = FIIdent;
	    }

	    public String getFIIdentType ()
	    {
	        return FIIdentType;
	    }

	    public void setFIIdentType (String FIIdentType)
	    {
	        this.FIIdentType = FIIdentType;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [AcctId = "+AcctId+", AcctType = "+AcctType+", FIIdent = "+FIIdent+", FIIdentType = "+FIIdentType+"]";
	    }
}
