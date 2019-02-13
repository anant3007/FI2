package com.fi.gateway.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DebitAddRs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement
	private DebitStatus DebitStatus;

	@XmlElement
    private String Severity;

	@XmlElement
    private DebitKeys DebitKeys;

	@XmlElement
    private String SvcProviderName;

	@XmlElement
    private String StatusCode;

    public DebitStatus getDebitStatus ()
    {
        return DebitStatus;
    }

    public void setDebitStatus (DebitStatus DebitStatus)
    {
        this.DebitStatus = DebitStatus;
    }

    public String getSeverity ()
    {
        return Severity;
    }

    public void setSeverity (String Severity)
    {
        this.Severity = Severity;
    }

    public DebitKeys getDebitKeys ()
    {
        return DebitKeys;
    }

    public void setDebitKeys (DebitKeys DebitKeys)
    {
        this.DebitKeys = DebitKeys;
    }

    public String getSvcProviderName ()
    {
        return SvcProviderName;
    }

    public void setSvcProviderName (String SvcProviderName)
    {
        this.SvcProviderName = SvcProviderName;
    }

    public String getStatusCode ()
    {
        return StatusCode;
    }

    public void setStatusCode (String StatusCode)
    {
        this.StatusCode = StatusCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DebitStatus = "+DebitStatus+", Severity = "+Severity+", DebitKeys = "+DebitKeys+", SvcProviderName = "+SvcProviderName+", StatusCode = "+StatusCode+"]";
    }
}
