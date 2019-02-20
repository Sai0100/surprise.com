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
@Table(name = "SUP_TBL_JOURNEY")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Journey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int journeyId;
	private String fromJ;
	private String toJ;
	private double kms;
	private String busNum;
	private String seatNo;
	private String estTime;
	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date journeyDate;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busNum == null) ? 0 : busNum.hashCode());
		result = prime * result + ((estTime == null) ? 0 : estTime.hashCode());
		result = prime * result + ((fromJ == null) ? 0 : fromJ.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + journeyId;
		long temp;
		temp = Double.doubleToLongBits(kms);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((seatNo == null) ? 0 : seatNo.hashCode());
		result = prime * result + ((toJ == null) ? 0 : toJ.hashCode());
		result = prime * result + userId;
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
		Journey other = (Journey) obj;
		if (busNum == null) {
			if (other.busNum != null)
				return false;
		} else if (!busNum.equals(other.busNum))
			return false;
		if (estTime == null) {
			if (other.estTime != null)
				return false;
		} else if (!estTime.equals(other.estTime))
			return false;
		if (fromJ == null) {
			if (other.fromJ != null)
				return false;
		} else if (!fromJ.equals(other.fromJ))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (journeyId != other.journeyId)
			return false;
		if (Double.doubleToLongBits(kms) != Double.doubleToLongBits(other.kms))
			return false;
		if (seatNo == null) {
			if (other.seatNo != null)
				return false;
		} else if (!seatNo.equals(other.seatNo))
			return false;
		if (toJ == null) {
			if (other.toJ != null)
				return false;
		} else if (!toJ.equals(other.toJ))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Journey [journeyId=" + journeyId + ", from=" + fromJ + ", to=" + toJ + ", kms=" + kms + ", busNum="
				+ busNum + ", seatNo=" + seatNo + ", estTime=" + estTime + ", userId=" + userId + ", journeyDate="
				+ journeyDate + "]";
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getFromJ() {
		return fromJ;
	}

	public void setFromJ(String fromJ) {
		this.fromJ = fromJ;
	}

	public String getToJ() {
		return toJ;
	}

	public void setToJ(String toJ) {
		this.toJ = toJ;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getBusNum() {
		return busNum;
	}

	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getEstTime() {
		return estTime;
	}

	public void setEstTime(String estTime) {
		this.estTime = estTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
