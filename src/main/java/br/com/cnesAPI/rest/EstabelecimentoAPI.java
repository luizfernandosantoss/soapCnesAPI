package br.com.cnesAPI.rest;

import br.com.cnesAPI.service.EstabelecimentoService;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseConsultarEstabelecimentoSaude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoAPI {

    @Autowired
    private EstabelecimentoService estabelicimentoService;

    @GetMapping("/consultarPorCNES/{cnes}")
    public ResponseEntity<ResponseConsultarEstabelecimentoSaude> consultaPorCnes(@PathVariable String cnes) throws  EstabelecimentoSaudeFault {
        ResponseConsultarEstabelecimentoSaude reposta = estabelicimentoService.buscarEstabelecimento(cnes,null);
        return new ResponseEntity(reposta, HttpStatus.OK);

    }

    @GetMapping("/consultarPorCNPJ/{cnpj}")
    public ResponseEntity<ResponseConsultarEstabelecimentoSaude> consultarPorCNPJ(@PathVariable String cnpj) throws  EstabelecimentoSaudeFault {
        ResponseConsultarEstabelecimentoSaude reposta = estabelicimentoService.buscarEstabelecimento(null,cnpj);
        return new ResponseEntity(reposta, HttpStatus.OK);

    }

}

