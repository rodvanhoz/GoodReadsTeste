package com.testeapigoodreads.testeapigoodreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testeapigoodreads.testeapigoodreads.models.GoodReads;
import com.testeapigoodreads.testeapigoodreads.models.GoodreadsResponse;
import com.testeapigoodreads.testeapigoodreads.models.GoodreadsResponse.Search.Results.Work;
import com.testeapigoodreads.testeapigoodreads.models.Resultado;


@Controller
public class GoodsReadsController {
	
	InputStream st;

	@RequestMapping(value="/resultado", method=RequestMethod.GET)
	public ModelAndView form(@ModelAttribute("titlelivro") String titlelivro, @ModelAttribute("authorlivro") String authorlivro ) throws IOException, JAXBException {
		
		ModelAndView mv = new ModelAndView("resultado");
		GoodReads gr = new GoodReads(titlelivro);
		
		// carregando xml 
		URL url11 = new URL(gr.toString());    
		URLConnection uconn = url11.openConnection();
		
		uconn.setRequestProperty("Content-Type", "text/xml");
		uconn.setDoInput(true);
		uconn.setDoOutput(true);
		HttpURLConnection conn = (HttpURLConnection) uconn;
		conn.connect();
		Object content = conn.getContent();
		
		st = (InputStream) content;
		String str=null;
		String str1=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(st));
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    
		String inputLine;
	    StringBuilder response = new StringBuilder();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    StringReader q = new StringReader(response.toString());
		JAXBContext jb = JAXBContext.newInstance("com.testeapigoodreads.testeapigoodreads.models");
	    
		Unmarshaller jaxbUnmarshaller = jb.createUnmarshaller();
		GoodreadsResponse grr = (GoodreadsResponse) jaxbUnmarshaller.unmarshal(new StreamSource(new StringReader(response.toString())));
		Object tmp = grr.getSearch().getResults().getWork();
		
		Resultado resultado;
		ArrayList<Resultado> listaresultado = new ArrayList<Resultado>(); 
		
		for(Work w : grr.getSearch().getResults().getWork()) {
			resultado = new Resultado();
			resultado.setTitulo(w.getBestBook().getTitle());
			resultado.setAuthor(w.getBestBook().getAuthor().getName());
			resultado.setUrlimg(w.getBestBook().getImageUrl());
			
			listaresultado.add(resultado);
		}

		mv.addObject("resultado", listaresultado);
		
		return mv; 
	}
	
}
