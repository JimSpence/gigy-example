package com.gigy.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skill_id")
	private long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Level level;

	@ManyToOne
	@JoinColumn (name="person_id")
	@JsonBackReference
	private Person person;

//	@Column(name = "person_id")
//	private long personid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

//	public long getPersonid() {
//		return personid;
//	}
//
//	public void setPersonid(long personid) {
//		this.personid = personid;
//	}
}


