package sk.tuke.coronastatapp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class HospitalPatients {
    @Id
    @Column(nullable = false)
    private int id;


    @Column(nullable = false)
    private int hospitalId;

    @Column(nullable = false)
    private Date ReportedAt;

    @Column(nullable = false)
    private int ventilatedCovid;

    @Column(nullable = false)
    private int nonCovid;

    @Column(nullable = false)
    private int confirmedCovid;

    @Column(nullable = false)
    private int suspectedCovid;

    @Column(nullable = false)
    private Date updatedAt;

    @Column(nullable = false)
    private Date publishedOn;

    HospitalPatients(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Date getReportedAt() {
        return ReportedAt;
    }

    public void setReportedAt(Date reportedAt) {
        ReportedAt = reportedAt;
    }

    public int getVentilatedCovid() {
        return ventilatedCovid;
    }

    public void setVentilatedCovid(int ventilatedCovid) {
        this.ventilatedCovid = ventilatedCovid;
    }

    public int getNonCovid() {
        return nonCovid;
    }

    public void setNonCovid(int nonCovid) {
        this.nonCovid = nonCovid;
    }

    public int getConfirmedCovid() {
        return confirmedCovid;
    }

    public void setConfirmedCovid(int confirmedCovid) {
        this.confirmedCovid = confirmedCovid;
    }

    public int getSuspectedCovid() {
        return suspectedCovid;
    }

    public void setSuspectedCovid(int suspectedCovid) {
        this.suspectedCovid = suspectedCovid;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public HospitalPatients(int id, int hospitalId, Date reportedAt, int ventilatedCovid, int nonCovid, int confirmedCovid, int suspectedCovid, Date updatedAt, Date publishedOn) {
        this.id = id;
        this.hospitalId = hospitalId;
        ReportedAt = reportedAt;
        this.ventilatedCovid = ventilatedCovid;
        this.nonCovid = nonCovid;
        this.confirmedCovid = confirmedCovid;
        this.suspectedCovid = suspectedCovid;
        this.updatedAt = updatedAt;
        this.publishedOn = publishedOn;
    }

    @Override
    public String toString() {
        return "HospitalPatients{" +
                "id=" + id +
                ", hospitalId=" + hospitalId +
                ", ReportedAt=" + ReportedAt +
                ", ventilatedCovid=" + ventilatedCovid +
                ", nonCovid=" + nonCovid +
                ", confirmedCovid=" + confirmedCovid +
                ", suspectedCovid=" + suspectedCovid +
                ", updatedAt=" + updatedAt +
                ", publishedOn=" + publishedOn +
                '}';
    }
}
