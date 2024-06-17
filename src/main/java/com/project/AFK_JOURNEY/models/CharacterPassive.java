package com.project.AFK_JOURNEY.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_passive")
public class CharacterPassive {
    @Id
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "herofocus")
    private String heroFocus;
    @Column(name = "enhanceforce")
    private String enhanceForce;

    @Column(name = "levelupgrade")
    private String levelUpgrade;

    public CharacterPassive() {
    }

    public CharacterPassive(Integer cid, String heroFocus, String enhanceForce, String levelUpgrade) {
        this.cid = cid;
        this.heroFocus = heroFocus;
        this.enhanceForce = enhanceForce;
        this.levelUpgrade = levelUpgrade;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getHeroFocus() {
        return heroFocus;
    }

    public void setHeroFocus(String heroFocus) {
        this.heroFocus = heroFocus;
    }

    public String getEnhanceForce() {
        return enhanceForce;
    }

    public void setEnhanceForce(String enhanceForce) {
        this.enhanceForce = enhanceForce;
    }

    public String getLevelUpgrade() {
        return levelUpgrade;
    }

    public void setLevelUpgrade(String levelUpgrade) {
        this.levelUpgrade = levelUpgrade;
    }
}
