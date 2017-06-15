package com.model.product;

import java.io.Serializable;
import java.util.Date;


/**
 * @author wuyanjie1
 * @date 2017年6月1日
 */
public class ProductOperateLog implements Serializable {

	private static final long serialVersionUID = 1131044057352944308L;
	
	/**
	 * 主键ID
	 */
	private Long              id;
	/**
	 * 业务ID
	 */
	private Long              keyId;                               
	/**
	 * 业务ID类型
	 */
	private Long 			  keyType;
    /**
     * 操作类型
     */
    private Integer           operateType;                           
    /**
     * 功能名称
     */
    private String            functionsName;                             
    /**
     * 操作人ID
     */
    private Long              operatorId;                            
    /**
     * 日志创建时间
     */
    private Date              createTime;                                   
    /**
     * 操作描述
     */
    private String            operateContents;                           
    /**
     * 日志来源(产品pool:0 /hessian调用:1)
     */
    private Integer           origin;                                  
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getKeyId() {
		return keyId;
	}

	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	public Long getKeyType() {
		return keyType;
	}

	public void setKeyType(Long keyType) {
		this.keyType = keyType;
	}

	public Integer getOperateType() {
		return operateType;
	}

	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}

	public String getFunctionsName() {
		return functionsName;
	}

	public void setFunctionsName(String functionsName) {
		this.functionsName = functionsName;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOperateContents() {
		return operateContents;
	}

	public void setOperateContents(String operateContents) {
		this.operateContents = operateContents;
	}

	public Integer getOrigin() {
		return origin;
	}

	public void setOrigin(Integer origin) {
		this.origin = origin;
	}

}

/**
 * @author wuyanjie1
 * @date 2017年6月1日
 */
class OperateLogConstant{
	
	/**
	 * 操作类型：新增 <br>operateType=1
	 */
	public static final int   OPERATELOG_TYPE_NEW    = 1;
	
	/**
	 * 操作类型：编辑 <br>operateType=3
	 */
	public static final int   OPERATELOG_TYPE_EDIT   = 3;
	
	/**
	 * 操作类型：删除 <br>operateType=2
	 */
	public static final int   OPERATELOG_TYPE_DELETE = 2;
	
	/**
	 * 来源：产品pool
	 * 
	 */
	public static final int ORIGINAL_PRODUCT_POOL = 0;
	
	/**
	 * 来源：hessian调用
	 */
	public static final int ORIGINAL_HESSIAN = 1;
	
	/**
	 * key类型：product_id
	 * 
	 */
	public static final String KYE_TYPE_PRODUCT_ID = "product_id";
	
	/**
	 * key类型：pminfo_id
	 */
	public static final String KYE_TYPE_PM_INFO_ID = "pminfo_id";
}
