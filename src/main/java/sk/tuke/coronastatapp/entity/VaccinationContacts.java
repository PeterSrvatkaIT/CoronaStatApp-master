package sk.tuke.coronastatapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class VaccinationContacts {

    // Kde mam dat @Id anotaciu ? V  scheme nie je, ze to ma aj interne ID, pritom ine tabulky maju aj interne ID
    //dal som preto @Id k tejto premennej
    @Id // preverit ci staci @Id...., Ci netreba aj inu anotaciu ?
    @Column(nullable = false)
    @OneToOne
    @JoinColumn(name = "Hospital.id")
    Hospital hospitalId;

    @Column(nullable = false)
    String substitutesPhones;

    @Column(nullable = false)
    String substitutesEmails;

    @Column(nullable = false)
    String substitutesLink;

    @Column(nullable = false)
    String substitutesNote;

    @Column(nullable = false)
    boolean isAcceptingNewRegistrations;

    @Column(nullable = false)
    Date updatedAt;

    public VaccinationContacts() {
    }

    public VaccinationContacts(Hospital hospitalId, String substitutesPhones, String substitutesEmails,
                               String substitutesLink, String substitutesNote,
                               boolean isAcceptingNewRegistrations, Date updatedAt) {
        this.hospitalId = hospitalId;
        this.substitutesPhones = substitutesPhones;
        this.substitutesEmails = substitutesEmails;
        this.substitutesLink = substitutesLink;
        this.substitutesNote = substitutesNote;
        this.isAcceptingNewRegistrations = isAcceptingNewRegistrations;
        this.updatedAt = updatedAt;
    }

    public Hospital getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Hospital hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getSubstitutesPhones() {
        return substitutesPhones;
    }

    public void setSubstitutesPhones(String substitutesPhones) {
        this.substitutesPhones = substitutesPhones;
    }

    public String getSubstitutesEmails() {
        return substitutesEmails;
    }

    public void setSubstitutesEmails(String substitutesEmails) {
        this.substitutesEmails = substitutesEmails;
    }

    public String getSubstitutesLink() {
        return substitutesLink;
    }

    public void setSubstitutesLink(String substitutesLink) {
        this.substitutesLink = substitutesLink;
    }

    public String getSubstitutesNote() {
        return substitutesNote;
    }

    public void setSubstitutesNote(String substitutesNote) {
        this.substitutesNote = substitutesNote;
    }

    public boolean isAcceptingNewRegistrations() {
        return isAcceptingNewRegistrations;
    }

    public void setAcceptingNewRegistrations(boolean acceptingNewRegistrations) {
        isAcceptingNewRegistrations = acceptingNewRegistrations;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "VaccinationContacts{" +
                "hospitalId=" + hospitalId +
                ", substitutesPhones='" + substitutesPhones + '\'' +
                ", substitutesEmails='" + substitutesEmails + '\'' +
                ", substitutesLink='" + substitutesLink + '\'' +
                ", substitutesNote='" + substitutesNote + '\'' +
                ", isAcceptingNewRegistrations=" + isAcceptingNewRegistrations +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
