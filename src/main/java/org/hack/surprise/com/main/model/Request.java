package org.hack.surprise.com.main.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SUP_TBL_REQUEST")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Request implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reqId;
	private String itemDesc;
	private String itemSize;
	private String charges;
	private String delToName;
	private String delToPhone;
	private String delToDesc;
	private String delToComment;
	private User user;
	private boolean status;

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public Request() {
		// TODO Auto-generated constructor stub
	}

	public Request(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	@Temporal(TemporalType.DATE)
	private Date delDate;

	@Temporal(TemporalType.TIME)
	private Date estTime;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charges == null) ? 0 : charges.hashCode());
		result = prime * result + ((delDate == null) ? 0 : delDate.hashCode());
		result = prime * result + ((delToComment == null) ? 0 : delToComment.hashCode());
		result = prime * result + ((delToDesc == null) ? 0 : delToDesc.hashCode());
		result = prime * result + ((delToName == null) ? 0 : delToName.hashCode());
		result = prime * result + ((delToPhone == null) ? 0 : delToPhone.hashCode());
		result = prime * result + ((estTime == null) ? 0 : estTime.hashCode());
		result = prime * result + ((itemDesc == null) ? 0 : itemDesc.hashCode());
		result = prime * result + ((itemSize == null) ? 0 : itemSize.hashCode());
		result = prime * result + reqId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (charges == null) {
			if (other.charges != null)
				return false;
		} else if (!charges.equals(other.charges))
			return false;
		if (delDate == null) {
			if (other.delDate != null)
				return false;
		} else if (!delDate.equals(other.delDate))
			return false;
		if (delToComment == null) {
			if (other.delToComment != null)
				return false;
		} else if (!delToComment.equals(other.delToComment))
			return false;
		if (delToDesc == null) {
			if (other.delToDesc != null)
				return false;
		} else if (!delToDesc.equals(other.delToDesc))
			return false;
		if (delToName == null) {
			if (other.delToName != null)
				return false;
		} else if (!delToName.equals(other.delToName))
			return false;
		if (delToPhone == null) {
			if (other.delToPhone != null)
				return false;
		} else if (!delToPhone.equals(other.delToPhone))
			return false;
		if (estTime == null) {
			if (other.estTime != null)
				return false;
		} else if (!estTime.equals(other.estTime))
			return false;
		if (itemDesc == null) {
			if (other.itemDesc != null)
				return false;
		} else if (!itemDesc.equals(other.itemDesc))
			return false;
		if (itemSize == null) {
			if (other.itemSize != null)
				return false;
		} else if (!itemSize.equals(other.itemSize))
			return false;
		if (reqId != other.reqId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", itemDesc=" + itemDesc + ", itemSize=" + itemSize + ", charges=" + charges
				+ ", delToName=" + delToName + ", delToPhone=" + delToPhone + ", delToDesc=" + delToDesc
				+ ", delToComment=" + delToComment + ", delDate=" + delDate + ", estTime=" + estTime + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemSize() {
		return itemSize;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public String getDelToName() {
		return delToName;
	}

	public void setDelToName(String delToName) {
		this.delToName = delToName;
	}

	public String getDelToPhone() {
		return delToPhone;
	}

	public void setDelToPhone(String delToPhone) {
		this.delToPhone = delToPhone;
	}

	public String getDelToDesc() {
		return delToDesc;
	}

	public void setDelToDesc(String delToDesc) {
		this.delToDesc = delToDesc;
	}

	public String getDelToComment() {
		return delToComment;
	}

	public void setDelToComment(String delToComment) {
		this.delToComment = delToComment;
	}

	public Date getDelDate() {
		return delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public Date getEstTime() {
		return estTime;
	}

	public void setEstTime(Date estTime) {
		this.estTime = estTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
