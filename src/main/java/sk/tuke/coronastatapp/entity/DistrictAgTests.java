package sk.tuke.coronastatapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DistrictAgTests {

    @Id
    @Column(nullable = false)
    private String id;
    @ManyToOne
    @JoinColumn(name = "District.id", nullable = false)
    private District district;
    @Column(nullable = false)
    private float positivityRate;
    @Column(nullable = false)
    private Date updatedAt;
    @Column(nullable = false)
    private Date publishedOn;
    @Column(nullable = false)
    private int positivesCount;
    @Column(nullable = false)
    private int negativesCount;
    @Column(nullable = false)
    private int positivesSum;
    @Column(nullable = false)
    private int negativesSum;

    public DistrictAgTests() {
    }

    public DistrictAgTests(String id, District district, float positivityRate, Date updatedAt, Date publishedOn, int positivesCount, int negativesCount, int positivesSum, int negativesSum) {
        this.id = id;
        this.district = district;
        this.positivityRate = positivityRate;
        this.updatedAt = updatedAt;
        this.publishedOn = publishedOn;
        this.positivesCount = positivesCount;
        this.negativesCount = negativesCount;
        this.positivesSum = positivesSum;
        this.negativesSum = negativesSum;
    }

    public String getId() {
        return id;
    }

    public District getDistrict() {
        return district;
    }

    public float getPositivityRate() {
        return positivityRate;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public int getPositivesCount() {
        return positivesCount;
    }

    public int getNegativesCount() {
        return negativesCount;
    }

    public int getPositivesSum() {
        return positivesSum;
    }

    public int getNegativesSum() {
        return negativesSum;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public void setPositivityRate(float positivityRate) {
        this.positivityRate = positivityRate;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public void setPositivesCount(int positivesCount) {
        this.positivesCount = positivesCount;
    }

    public void setNegativesCount(int negativesCount) {
        this.negativesCount = negativesCount;
    }

    public void setPositivesSum(int positivesSum) {
        this.positivesSum = positivesSum;
    }

    public void setNegativesSum(int negativesSum) {
        this.negativesSum = negativesSum;
    }

    @Override
    public String toString() {
        return "DistrictAgTests{" +
                "id='" + id + '\'' +
                ", district=" + district +
                ", positivityRate=" + positivityRate +
                ", updatedAt=" + updatedAt +
                ", publishedOn=" + publishedOn +
                ", positivesCount=" + positivesCount +
                ", negativesCount=" + negativesCount +
                ", positivesSum=" + positivesSum +
                ", negativesSum=" + negativesSum +
                '}';
    }
}


