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
	private String vehicleNum;
	private String seatNum;
	private String estTime;
	private int userId;
	private int travelType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date journeyDate = new Date();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicleNum == null) ? 0 : vehicleNum.hashCode());
		result = prime * result + ((estTime == null) ? 0 : estTime.hashCode());
		result = prime * result + ((fromJ == null) ? 0 : fromJ.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + journeyId;
		long temp;
		temp = Double.doubleToLongBits(kms);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((seatNum == null) ? 0 : seatNum.hashCode());
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
		if (vehicleNum == null) {
			if (other.vehicleNum != null)
				return false;
		} else if (!vehicleNum.equals(other.vehicleNum))
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
		if (seatNum == null) {
			if (other.seatNum != null)
				return false;
		} else if (!seatNum.equals(other.seatNum))
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
				+ vehicleNum + ", seatNo=" + seatNum + ", estTime=" + estTime + ", userId=" + userId + ", journeyDate="
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

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
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

	public int getTravelType() {
		return travelType;
	}

	public void setTravelType(int travelType) {
		this.travelType = travelType;
	}
}
