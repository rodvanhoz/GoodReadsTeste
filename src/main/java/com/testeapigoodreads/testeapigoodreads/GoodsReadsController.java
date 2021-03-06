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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.testeapigoodreads.testeapigoodreads.models.GoodReads;
import com.testeapigoodreads.testeapigoodreads.models.GoodreadsResponse;
import com.testeapigoodreads.testeapigoodreads.models.GoodreadsResponse.Search.Results.Work;
import com.testeapigoodreads.testeapigoodreads.models.Livros;
import com.testeapigoodreads.testeapigoodreads.models.Resultado;
import com.testeapigoodreads.testeapigoodreads.repository.LivrosRepository;
import com.testeapigoodreads.testeapigoodreads.repository.ResultadoRepository;


@Controller
public class GoodsReadsController {
	
	@Autowired
	private ResultadoRepository rr; 
	
	@Autowired
	private LivrosRepository lr;
	
	public ArrayList<Resultado> r = new ArrayList<Resultado>();
	InputStream st;

	@RequestMapping(value="/resultado")
	public ModelAndView form(@ModelAttribute("titlelivro") String titlelivro, @ModelAttribute("authorlivro") String authorlivro ) throws IOException, JAXBException {
		
		// limpando a tabela de resultados
		rr.deleteAll();
		
		// configurando a api goodreads
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
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    
		String inputLine;
	    StringBuilder response = new StringBuilder();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

		JAXBContext jb = JAXBContext.newInstance("com.testeapigoodreads.testeapigoodreads.models");
	    
		Unmarshaller jaxbUnmarshaller = jb.createUnmarshaller();
		GoodreadsResponse grr = (GoodreadsResponse) jaxbUnmarshaller.unmarshal(new StreamSource(new StringReader(response.toString())));
		
		Resultado resultado;
		
		for(Work w : grr.getSearch().getResults().getWork()) {
			resultado = new Resultado();
			resultado.setTitulo(w.getBestBook().getTitle());
			resultado.setAuthor(w.getBestBook().getAuthor().getName());
			resultado.setUrlimg(w.getBestBook().getImageUrl());
			resultado.setIdlivro(w.getBestBook().getId().getValue());
			resultado.setPalavrachave(titlelivro);
			
			// verifica se o livro já está no catalogo
			resultado.setCatalogado(VerificaCatalogo(w.getId().getValue()));
			
			//rr.save(resultado);
			r.add(resultado);
			
		}

		//Iterable<Resultado> resultados = rr.findAll();
		Iterable<Resultado> resultados = (Iterable<Resultado>) r;
		mv.addObject("resultados", resultados);
		return mv; 
	}
	
	@RequestMapping(value = "/resultado" , method=RequestMethod.POST)
	public void editCustomer(@RequestParam(value = "catalog", required = false) String checkboxValue) {	
		
		System.out.println("teste");
//		lr.save(r);
//		return "redirect:/resultado";
	}

	@RequestMapping("/{IdLivro}")
	public ModelAndView salvaCatalogo(@PathVariable("IdLivro") long IdLivro) {
		
		ModelAndView mv = new ModelAndView("resultado");
		Iterable<Livros> livros = lr.findByIdLivro(IdLivro);
		
		Livros livro;
		if (livros == null) {
			for (Resultado result : r) {
				livro = new Livros(result.getTitulo(), result.getAuthor(), result.getUrlimg(), result.getIdlivro(), result.getPalavrachave());
				lr.save(livro);
			}
		}
		
		return mv;
	}
	
	
	// métodos para uso do controller
	private String VerificaCatalogo(long IdLivro) {
		
		String retorna = "N";
		
		for (Livros l : lr.findByIdLivro(IdLivro)) {
			if (l.getIdlivro() == IdLivro)
				retorna = "S";
		}
		
		return retorna;
	}
}
