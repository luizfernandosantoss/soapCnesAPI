package br.com.cnesAPI.service;

import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesFault;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarEstabelecimentoSaude;

public interface BuscaCnesService {

    ResponseConsultarEstabelecimentoSaude buscarEstabelecimento(String cnes) throws CnesFault;

}
