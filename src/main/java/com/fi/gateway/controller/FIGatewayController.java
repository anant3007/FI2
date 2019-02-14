package com.fi.gateway.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.gateway.model.AcctKeys;
import com.fi.gateway.model.DebitAddRs;
import com.fi.gateway.model.DebitInfo;
import com.fi.gateway.model.DebitKeys;
import com.fi.gateway.model.DebitStatus;

@RestController
@RequestMapping("/api")
public class FIGatewayController {

	@PutMapping(value="/fi2/debit",produces=MediaType.APPLICATION_XML_VALUE,consumes=MediaType.APPLICATION_XML_VALUE)
	public DebitAddRs debit(@RequestBody DebitInfo debitInfo)
	{
		DebitAddRs response= new DebitAddRs();	
		response.setSeverity("Info");
		response.setStatusCode(""+0);
		response.setSvcProviderName("DNA");
		
		AcctKeys ak= new AcctKeys();
		ak.setAcctId(""+560731492);
		ak.setAcctType("SDA");
		
		DebitKeys dk = new DebitKeys();
		dk.setDebitId("123");
		dk.setAcctKeys(ak);
		
		DebitStatus ds = new DebitStatus();
		ds.setDebitStatusCode("Posted from FI 2");
		ds.setEffDt("2018-18-01T10:12:12.211");
		response.setDebitKeys(dk);
		response.setDebitStatus(ds);
		
		return response;		
	}
}
