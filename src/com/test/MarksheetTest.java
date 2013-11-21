package com.test;

import com.dto.Marksheet;
import com.service.MarksheetService;

public class MarksheetTest {
	public static void main(String[] args) {
		Marksheet marksheet = new Marksheet();
		MarksheetService marksheetService = new MarksheetService();
		marksheet.setId(1);
		marksheet.setName("Ashish");
		marksheet.setPhysics(99);
		marksheet.setChemistry(88);
		marksheet.setMaths(77);
		marksheetService.add(marksheet);
	}
}
