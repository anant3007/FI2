package com.fi.gateway.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DebitInfo {

	@XmlElement
	private String Desc;

	@XmlElement
    private CurrAmt CurrAmt;

	@XmlElement
    private String DebitType;

	@XmlElement
    private String EffDt;

	@XmlElement
    private AcctRef AcctRef;

	@XmlElement
    private String PostedDt;

    public String getDesc ()
    {
        return Desc;
    }

    public void setDesc (String Desc)
    {
        this.Desc = Desc;
    }

    public CurrAmt getCurrAmt ()
    {
        return CurrAmt;
    }

    public void setCurrAmt (CurrAmt CurrAmt)
    {
        this.CurrAmt = CurrAmt;
    }

    public String getDebitType ()
    {
        return DebitType;
    }

    public void setDebitType (String DebitType)
    {
        this.DebitType = DebitType;
    }

    public String getEffDt ()
    {
        return EffDt;
    }

    public void setEffDt (String EffDt)
    {
        this.EffDt = EffDt;
    }

    public AcctRef getAcctRef ()
    {
        return AcctRef;
    }

    public void setAcctRef (AcctRef AcctRef)
    {
        this.AcctRef = AcctRef;
    }

    public String getPostedDt ()
    {
        return PostedDt;
    }

    public void setPostedDt (String PostedDt)
    {
        this.PostedDt = PostedDt;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Desc = "+Desc+", CurrAmt = "+CurrAmt+", DebitType = "+DebitType+", EffDt = "+EffDt+", AcctRef = "+AcctRef+", PostedDt = "+PostedDt+"]";
    }
}
