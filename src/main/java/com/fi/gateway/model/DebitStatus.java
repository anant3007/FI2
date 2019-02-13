package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlElement;

public class DebitStatus {

	@XmlElement
	 private String EffDt;

	@XmlElement
	    private String DebitStatusCode;

	    public String getEffDt ()
	    {
	        return EffDt;
	    }

	    public void setEffDt (String EffDt)
	    {
	        this.EffDt = EffDt;
	    }

	    public String getDebitStatusCode ()
	    {
	        return DebitStatusCode;
	    }

	    public void setDebitStatusCode (String DebitStatusCode)
	    {
	        this.DebitStatusCode = DebitStatusCode;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [EffDt = "+EffDt+", DebitStatusCode = "+DebitStatusCode+"]";
	    }
}
