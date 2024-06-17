package com.project.AFK_JOURNEY.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_review")
public class CharacterReview {
    public CharacterReview() {
    }

    @Id
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "review")
    private String review;
    @Column(name = "pveweap")
    private String pveWeapon;

    @Column(name = "pvpweap")
    private String pvpWeapon;

    public CharacterReview(Integer cid, String review, String pveWeapon, String pvpWeapon) {
        this.cid = cid;
        this.review = review;
        this.pveWeapon = pveWeapon;
        this.pvpWeapon = pvpWeapon;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPveWeapon() {
        return pveWeapon;
    }

    public void setPveWeapon(String pveWeapon) {
        this.pveWeapon = pveWeapon;
    }

    public String getPvpWeapon() {
        return pvpWeapon;
    }

    public void setPvpWeapon(String pvpWeapon) {
        this.pvpWeapon = pvpWeapon;
    }
}
