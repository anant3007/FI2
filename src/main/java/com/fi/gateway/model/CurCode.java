package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class CurCode {
	
	@XmlElement
	 private String CurCodeValue;

	@XmlElement
	    private String CurCodeType;

	    public String getCurCodeValue ()
	    {
	        return CurCodeValue;
	    }

	    public void setCurCodeValue (String CurCodeValue)
	    {
	        this.CurCodeValue = CurCodeValue;
	    }

	    public String getCurCodeType ()
	    {
	        return CurCodeType;
	    }

	    public void setCurCodeType (String CurCodeType)
	    {
	        this.CurCodeType = CurCodeType;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [CurCodeValue = "+CurCodeValue+", CurCodeType = "+CurCodeType+"]";
	    }
}
