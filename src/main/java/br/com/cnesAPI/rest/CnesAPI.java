package br.com.cnesAPI.rest;

import br.com.cnesAPI.service.BuscaCnesService;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesFault;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarEstabelecimentoSaude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cnes")
public class CnesAPI {

    @Autowired
    private BuscaCnesService buscaCnesService;

    @GetMapping("buscarPorCNES/{cnes}")
    public ResponseEntity<ResponseConsultarEstabelecimentoSaude> consulta(@PathVariable String cnes) throws CnesFault {
        ResponseConsultarEstabelecimentoSaude resposta = buscaCnesService.buscarEstabelecimento(cnes);
        return new ResponseEntity(resposta, HttpStatus.OK);
    }

}

