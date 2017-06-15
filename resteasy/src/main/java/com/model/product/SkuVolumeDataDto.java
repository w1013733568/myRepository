package com.model.product;

/**
 * @author wuyanjie1
 * @date 2017��6��1��
 */
public class SkuVolumeDataDto {
	/**
	 * ��ƷID
	 */
	private Long productId;
	
	/**
	 * ��Ʒ����
	 */
	private String productCname;
	
	/**
	 * ������
	 */
	private String ean13;

	/**
	 * ��Ŀid
	 */
	private Long categoryId;
	
	/**
	 * ��
	 */
	private Double length;

	/**
	 * ��
	 */
	private Double width;

	/**
	 * ��
	 */
	private Double height;

	/**
	 * ����
	 */
	private Double weight;

	/**
	 * ���
	 */
	private Double volume;

	/**
	 * ë��
	 */
	private Double grossWeight;

	/**
	 * ��׼��װ�������
	 */
	private Integer stdPackQty;

	/**
	 * �����ز�ԭ��
	 */
	private String applyReason;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Integer getStdPackQty() {
		return stdPackQty;
	}

	public void setStdPackQty(Integer stdPackQty) {
		this.stdPackQty = stdPackQty;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductCname() {
		return productCname;
	}

	public void setProductCname(String productCname) {
		this.productCname = productCname;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

}
