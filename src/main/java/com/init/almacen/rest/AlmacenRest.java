package com.init.almacen.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.almacen.entity.Almacen;

@RestController
@RequestMapping("/almacen")
public class AlmacenRest {
	private List<Almacen> almacen = new ArrayList<Almacen>();
	
	@PostMapping
	public ResponseEntity<Almacen> creaAlmacen(@RequestBody Almacen almacen1){
		almacen.add(almacen1);
		return ResponseEntity.ok(almacen1);
	}
	
	@GetMapping
	public ResponseEntity<List<Almacen>> getAlmacen(){
		
		//almacen.add(new Almacen(10,"Dorado","02/05/2014",120));
		//almacen.add(new Almacen(11,"Norte","02/05/2011",100));
		//almacen.add(new Almacen(12,"Calima","02/05/2010",130));
		//almacen.add(new Almacen(13,"Suba","02/05/2013",100));
		//Almacen almacen = new Almacen();
		//almacen.setCapacidad(10);
		//almacen.setFecha("01/06/2021");
		//almacen.setId(10);
		//almacen.setNombre("OAT");
		return ResponseEntity.ok(almacen);
	}
	
	//@GetMapping
	//@RequestMapping(value="Almacen", method=RequestMethod.GET)
	public String hello() {
		return "Hello API rest API";
	}

}
