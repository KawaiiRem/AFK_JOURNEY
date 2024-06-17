package com.project.AFK_JOURNEY.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_summary")
public class CharacterSummary {
    @Id
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "name")
    private String name;
    @Column(name = "faction")
    private String faction;
    @Column(name = "class")
    private String charClass;


    public CharacterSummary(int cid, String name, String faction, String charClass) {
        this.cid = cid;
        this.name = name;
        this.faction = faction;
        this.charClass = charClass;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }
    public CharacterSummary(){}

}
