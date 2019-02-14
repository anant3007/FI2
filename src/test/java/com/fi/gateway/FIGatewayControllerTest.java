package com.fi.gateway;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fi.gateway.controller.FIGatewayController;



@RunWith(SpringRunner.class)
@WebMvcTest(value = FIGatewayController.class, secure = false)
public class FIGatewayControllerTest {

	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void debit() throws Exception {
		
		String sampleRequestBody="<DebitAddOperRequest xmlns:xsd=\"http://www.w3.org/2001.XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n" + 
				"	<EFXHdr>\r\n" + 
				"		<Orrganization>\r\n" + 
				"				<OrgId>8871085</OrgId>\r\n" + 
				"				<Environment>ABTR</Environment>\r\n" + 
				"		</Orrganization>\r\n" + 
				"	</EFXHdr>\r\n" + 
				"	<DebitInfo>\r\n" + 
				"	<DebitType>Withdrawal</DebitType>\r\n" + 
				"	<EffDt></EffDt>\r\n" + 
				"	<PostedDt></PostedDt>\r\n" + 
				"	<Desc>Abc to Gene Fagg +180012831713</Desc>\r\n" + 
				"	<AcctRef>\r\n" + 
				"		<AcctId>5607314292</AcctId>\r\n" + 
				"		<AcctType>SDA</AcctType>\r\n" + 
				"		<FIIdentType>ABA</FIIdentType>\r\n" + 
				"		<FIIdent>325081403</FIIdent>\r\n" + 
				"	</AcctRef>\r\n" + 
				"	<CurrAmt>\r\n" + 
				"		<Amt>78.00</Amt>\r\n" + 
				"		<CurCode>\r\n" + 
				"			<CurCodeType>ISO4217-Alpha</CurCodeType>\r\n" + 
				"			<CurCodeValue>USD</CurCodeValue>\r\n" + 
				"		</CurCode>\r\n" + 
				"	</CurrAmt>\r\n" + 
				"	</DebitInfo>\r\n" + 
				"</DebitAddOperRequest>";
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put(
				"/api/fi2/debit").accept(
				MediaType.APPLICATION_XML).content(sampleRequestBody).contentType(MediaType.APPLICATION_XML);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println(result.getResponse());

		String exampleResponseString="<DebitAddRs><svcProviderName>DNA</svcProviderName><severity>Info</severity><statusCode>0</statusCode><debitKeys><debitId>123</debitId><acctKeys><acctId>560731492</acctId><acctType>SDA</acctType></acctKeys></debitKeys><debitStatus><debitStatusCode>Posted from FI 2</debitStatusCode><effDt>2018-18-01T10:12:12.211</effDt></debitStatus></DebitAddRs>";
		
		assertEquals(exampleResponseString, result.getResponse().getContentAsString());


	}
	
	
	/*
	 * @Test public void debit_fail() throws Exception {
	 * 
	 * throw new Exception(); }
	 */
	 
	
}
