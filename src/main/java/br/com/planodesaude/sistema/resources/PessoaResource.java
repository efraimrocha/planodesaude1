package br.com.planodesaude.sistema.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.planodesaude.sistema.domain.Pessoa;

@RestController
@RequestMapping("/pessoa/")
public class PessoaResource extends Pessoa{
	
	/*@Autowired
	private Pessoa
	*/
	
	
	@Autowired
    Pessoa pessoa;
	/*
    @RequestMapping(value="/pessoa",method = RequestMethod.GET)
    public String createNewPessoa(Pessoa pessoa){
        this.pessoa.addpessoa(pessoa);
        return "redirect:/pessoa";
    }*/
}
