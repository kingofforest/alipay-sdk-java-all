package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.list.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-20 15:51:36
 */
public class AlipayEbppInvoiceTitleListGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4842499953571693156L;

	/** 
	 * 抬头列表
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

	public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}
	public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}
