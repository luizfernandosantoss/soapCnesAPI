package br.com.cnesAPI.service;

import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseConsultarEstabelecimentoSaude;

public interface EstabelecimentoService {

    ResponseConsultarEstabelecimentoSaude buscarEstabelecimento(String cnes, String cnpj) throws EstabelecimentoSaudeFault;
}