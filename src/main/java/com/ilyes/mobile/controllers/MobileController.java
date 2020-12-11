package com.ilyes.mobile.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilyes.mobile.entities.Mobile;
import com.ilyes.mobile.service.MobileService;
import com.sun.el.parser.ParseException;

@Controller
public class MobileController {
	@Autowired
	MobileService mobileService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createMobile";
	}
	@RequestMapping("/saveMobile")
	public String saveMobile(@ModelAttribute("produit") Mobile mobile,
	 @RequestParam("date") String date,
	 ModelMap modelMap) throws
	ParseException, java.text.ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 mobile.setDateCreation(dateCreation);

	 Mobile saveMobile = mobileService.saveMobile(mobile);
	String msg ="mobile enregistré avec Id "+saveMobile.getIdMobile();
	modelMap.addAttribute("msg", msg);
	return "createMobile";
	}
	@RequestMapping("/ListeProduits")
	public String listeProduits(ModelMap modelMap)
	{
	List<Mobile> prods = mobileService.getAllMobile();
	modelMap.addAttribute("produits", prods);
	return "listeProduits";
	}
	
	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	mobileService.deleteMobileById(id);
	List<Mobile> mobs = mobileService.getAllMobile();
	modelMap.addAttribute("produits", mobs);
	return "listeProduits";
	}
	
	@RequestMapping("/modifierMobile")
	public String editerMobile(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Mobile m= mobileService.getMobile(id);
	modelMap.addAttribute("mobile", m);
	return "editerMobile";
	}
	
	@RequestMapping("/updateMobile")
	public String updateMobile(@ModelAttribute("mobile") Mobile mobile,
	@RequestParam("date") String date, ModelMap modelmap) throws ParseException, java.text.ParseException
	{
		//conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date dateCreation = dateformat.parse(String.valueOf(date));
		 mobile.setDateCreation(dateCreation);

		 mobileService.updateMobile(mobile);
		 List<Mobile> mobs = mobileService.getAllMobile();
		modelmap.addAttribute("mobiles", mobs);
		return "listeMobiles";
		}


}
