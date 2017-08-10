package com.sic.tasa.dataobject;

import java.io.Serializable;  
/*************************************************************************
 * 
 * HCL CONFIDENTIAL
 * _________________________________________________________________________________
 * 
 * HCL is a trademark of HCL Company.
 *
 * Copyright © 2017 HCL. All rights reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of HCL
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to HCL and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from HCL.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History : 

public class FrmAdjFctrQueryBO implements Serializable{


    private String cmdclose; 

    private String cbomipseq; 

    private String cbofunds; 

    private String txtcomment; 

    private String cmdshowcomments; 

    private String lblfund; 

    public String getCmdclose() {
		return cmdclose;
	}

	public void setCmdclose(String cmdclose) {
		this.cmdclose = cmdclose;
	}

	public String getCbomipseq() {
		return cbomipseq;
	}

	public void setCbomipseq(String cbomipseq) {
		this.cbomipseq = cbomipseq;
	}

	public String getCbofunds() {
		return cbofunds;
	}

	public void setCbofunds(String cbofunds) {
		this.cbofunds = cbofunds;
	}

	public String getTxtcomment() {
		return txtcomment;
	}

	public void setTxtcomment(String txtcomment) {
		this.txtcomment = txtcomment;
	}

	public String getCmdshowcomments() {
		return cmdshowcomments;
	}

	public void setCmdshowcomments(String cmdshowcomments) {
		this.cmdshowcomments = cmdshowcomments;
	}

	public String getLblfund() {
		return lblfund;
	}

	public void setLblfund(String lblfund) {
		this.lblfund = lblfund;
	}

	public String getLblcomment() {
		return lblcomment;
	}

	public void setLblcomment(String lblcomment) {
		this.lblcomment = lblcomment;
	}

	private String lblcomment; 

    
    
//    @Override
//    public String toString() {
//      return "FrmAdjFctrQueryBO [cmdclose =" + cmdclose + " ,cbomipseq =" + cbomipseq + " ,cbofunds =" + cbofunds + " ,txtcomment =" + txtcomment + " ,cmdshowcomments =" + cmdshowcomments + " ,lblfund =" + lblfund + " ,lblcomment =" + lblcomment]";
//    }
    
}
