package com.gigy.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "people")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private long id;

	private String name;
	
	private String username;

	private int age;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	@Fetch(FetchMode.JOIN)
    @JsonManagedReference
	private List<Skill> skills = new ArrayList<Skill>();

//	@ManyToMany(cascade = CascadeType.MERGE)
//	@JoinTable(name = "people_parties",
//		joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id"),
//		inverseJoinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"))
//	@Fetch(FetchMode.JOIN)
//	private Set<Party> parties = new HashSet<Party>();

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

//	public Set<Party> getParties() {
//		return parties;
//	}
//
//	public void setParties(Set<Party> parties) {
//		this.parties = parties;
//	}

}