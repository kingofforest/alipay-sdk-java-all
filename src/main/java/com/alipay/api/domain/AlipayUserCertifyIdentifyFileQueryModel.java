package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户图片信息查询
 *
 * @author auto create
 * @since 1.0, 2020-07-13 20:23:59
 */
public class AlipayUserCertifyIdentifyFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6273162155537691223L;

	/**
	 * 文件的地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
