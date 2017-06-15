package com.model.product;

import java.io.Serializable;
import java.util.Date;


/**
 * @author wuyanjie1
 * @date 2017��6��1��
 */
public class ProductOperateLog implements Serializable {

	private static final long serialVersionUID = 1131044057352944308L;
	
	/**
	 * ����ID
	 */
	private Long              id;
	/**
	 * ҵ��ID
	 */
	private Long              keyId;                               
	/**
	 * ҵ��ID����
	 */
	private Long 			  keyType;
    /**
     * ��������
     */
    private Integer           operateType;                           
    /**
     * ��������
     */
    private String            functionsName;                             
    /**
     * ������ID
     */
    private Long              operatorId;                            
    /**
     * ��־����ʱ��
     */
    private Date              createTime;                                   
    /**
     * ��������
     */
    private String            operateContents;                           
    /**
     * ��־��Դ(��Ʒpool:0 /hessian����:1)
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
 * @date 2017��6��1��
 */
class OperateLogConstant{
	
	/**
	 * �������ͣ����� <br>operateType=1
	 */
	public static final int   OPERATELOG_TYPE_NEW    = 1;
	
	/**
	 * �������ͣ��༭ <br>operateType=3
	 */
	public static final int   OPERATELOG_TYPE_EDIT   = 3;
	
	/**
	 * �������ͣ�ɾ�� <br>operateType=2
	 */
	public static final int   OPERATELOG_TYPE_DELETE = 2;
	
	/**
	 * ��Դ����Ʒpool
	 * 
	 */
	public static final int ORIGINAL_PRODUCT_POOL = 0;
	
	/**
	 * ��Դ��hessian����
	 */
	public static final int ORIGINAL_HESSIAN = 1;
	
	/**
	 * key���ͣ�product_id
	 * 
	 */
	public static final String KYE_TYPE_PRODUCT_ID = "product_id";
	
	/**
	 * key���ͣ�pminfo_id
	 */
	public static final String KYE_TYPE_PM_INFO_ID = "pminfo_id";
}
