package com.project.AFK_JOURNEY.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_weapon")
public class CharacterWeapon {
    @Id
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "weapname")
    private String weaponName;
    @Column(name = "weapdes")
    private String weaponDescription;
    @Column(name = "weaplevel")
    private String weaponLevel;

    public CharacterWeapon(){}

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public String getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(String weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public CharacterWeapon(int cid, String weaponName, String weaponDescription, String weaponLevel) {
        this.cid = cid;
        this.weaponName = weaponName;
        this.weaponDescription = weaponDescription;
        this.weaponLevel = weaponLevel;
    }
}
