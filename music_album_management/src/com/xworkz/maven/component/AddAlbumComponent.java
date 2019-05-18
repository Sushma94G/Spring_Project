package com.xworkz.maven.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.maven.dto.AddAlbumDTO;
@Component
@RequestMapping("/")
public class AddAlbumComponent {
	
	
	private List<String> albumList=new ArrayList<>();
	
	public AddAlbumComponent() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}

	@RequestMapping("/addAlbum.do")
	public String onAddAlbum(AddAlbumDTO addAlbumDTO, Model model ) {
		System.out.println("invoked onAddAlbum...\t"+addAlbumDTO);
		model.addAttribute("albumName",addAlbumDTO.getAlbumName()+"was added successfully");
		albumList.add(addAlbumDTO.getAlbumName());
		System.out.println("Album size is:\t"+albumList.size());
		return "/AddAlbum.js";
	}
	
	@RequestMapping("/searchAlbum.do")
	public String onSearch(@RequestParam String search,Model model) {
		
		System.out.println("invoked on serach");
		
		if(albumList.contains(search)) {
			System.out.println("Album found...");
			model.addAttribute("message",search+"album exists");
		}
		else {
			model.addAttribute("message",search+"album not exists");

		}
		return "/Search.jsp";
		
	}

}







