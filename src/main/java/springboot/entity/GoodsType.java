package springboot.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsType implements Serializable {

	private static final long serialVersionUID = 1L;

	private String typeId;
	private String typeName;
	private Date createTime;
	private Date updateTime;
	
	public GoodsType() {
	}

	public GoodsType(String typeId, String typeName, Date createTime, Date updateTime) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "GoodsType [typeId=" + typeId + ", typeName=" + typeName + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}


}
