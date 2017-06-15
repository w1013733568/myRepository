package com.model.product;

/**
 * @author wuyanjie1
 * @date 2017年6月1日
 */
public class SkuVolumeDataDto {
	/**
	 * 产品ID
	 */
	private Long productId;
	
	/**
	 * 产品名称
	 */
	private String productCname;
	
	/**
	 * 条形码
	 */
	private String ean13;

	/**
	 * 类目id
	 */
	private Long categoryId;
	
	/**
	 * 长
	 */
	private Double length;

	/**
	 * 宽
	 */
	private Double width;

	/**
	 * 高
	 */
	private Double height;

	/**
	 * 重量
	 */
	private Double weight;

	/**
	 * 体积
	 */
	private Double volume;

	/**
	 * 毛重
	 */
	private Double grossWeight;

	/**
	 * 标准包装箱的数量
	 */
	private Integer stdPackQty;

	/**
	 * 申请重测原因
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
