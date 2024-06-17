package com.project.AFK_JOURNEY.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_skill")
public class CharacterSkill {
    public CharacterSkill(String sid, Integer cid, String skillName, String skillDescription, String levelUpgrade) {
        this.sid = sid;
        this.cid = cid;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.levelUpgrade = levelUpgrade;
    }

    @Id
    @Column(name = "sid")
    private String sid;
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "skillname")
    private String skillName;
    @Column(name = "description")
    private String skillDescription;
    @Column(name = "levelupgrade")
    private String levelUpgrade;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public String getLevelUpgrade() {
        return levelUpgrade;
    }

    public void setLevelUpgrade(String levelUpgrade) {
        this.levelUpgrade = levelUpgrade;
    }

    public CharacterSkill(){}

}
