package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class CurrAmt {

	 @XmlElement
	 private CurCode CurCode;

	 @XmlElement
	 private String Amt;

	    public CurCode getCurCode ()
	    {
	        return CurCode;
	    }

	    public void setCurCode (CurCode CurCode)
	    {
	        this.CurCode = CurCode;
	    }

	    public String getAmt ()
	    {
	        return Amt;
	    }

	    public void setAmt (String Amt)
	    {
	        this.Amt = Amt;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [CurCode = "+CurCode+", Amt = "+Amt+"]";
	    }
}
