package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class AcctKeys {

	@XmlElement
	private String AcctId;

	@XmlElement
    private String AcctType;

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

    @Override
    public String toString()
    {
        return "ClassPojo [AcctId = "+AcctId+", AcctType = "+AcctType+"]";
    }
}
