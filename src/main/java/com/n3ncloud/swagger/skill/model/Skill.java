package com.n3ncloud.swagger.skill.model;

public class Skill {
	private String SkillName;
	private int MP;
	private int Time;
	public String getSkillName() {
		return SkillName;
	}
	public void setSkillName(String skillName) {
		SkillName = skillName;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	public Skill(String skillName, int mP, int time) {
		super();
		SkillName = skillName;
		MP = mP;
		Time = time;
	}
	public Skill() {
		super();
	}
	@Override
	public String toString() {
		return "Skill [SkillName=" + SkillName + ", MP=" + MP + ", Time=" + Time + "]";
	}
	
}
