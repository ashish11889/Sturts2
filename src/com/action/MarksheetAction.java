package com.action;

import com.dto.Marksheet;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MarksheetService;

public class MarksheetAction extends ActionSupport {
	private Integer id;
	private String name;
	private Integer physics;
	private Integer chemistry;
	private Integer maths;
	private String operation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhysics() {
		return physics;
	}

	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	public Integer getChemistry() {
		return chemistry;
	}

	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String execute() throws Exception {
		Marksheet marksheet = new Marksheet();
		MarksheetService marksheetService = new MarksheetService();
		marksheet.setId(id);
		marksheet.setName(name);
		marksheet.setPhysics(physics);
		marksheet.setChemistry(chemistry);
		marksheet.setMaths(maths);
		if ("Add".equalsIgnoreCase(operation)) {
			marksheetService.add(marksheet);
			return "add";
		}
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		return INPUT;
	}

}
