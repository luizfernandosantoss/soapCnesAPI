package br.com.cnesAPI.service.impl;

import br.com.cnesAPI.autenticador.HeaderHandlerResolver;
import br.com.cnesAPI.service.EstabelecimentoService;
import br.gov.saude.servicos.cnes.mensageria.v1r0.filtropesquisaestabelecimentosaude.FiltroPesquisaEstabelecimentoSaudeType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.cnes.schema.corporativo.pessoajuridica.v1r0.cnpj.CNPJType;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.*;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoServiceImpl implements EstabelecimentoService {

    @Override
    public ResponseConsultarEstabelecimentoSaude buscarEstabelecimento(String cnes,String cnpj) throws EstabelecimentoSaudeFault {

        EstabelecimentoSaudeServicePortType port = abriConexao();
        RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = montarRequest(cnes, cnpj);
        return port.consultarEstabelecimentoSaude(requestConsultarEstabelecimentoSaude);

    }

    private EstabelecimentoSaudeServicePortType abriConexao(){
        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();
        service.setHandlerResolver(new HeaderHandlerResolver());
        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServicePort();
        return port;
    }

    private RequestConsultarEstabelecimentoSaude montarRequest(String cnes, String numeroCnpj){
        RequestConsultarEstabelecimentoSaude dados = new RequestConsultarEstabelecimentoSaude();
        FiltroPesquisaEstabelecimentoSaudeType filtro = new FiltroPesquisaEstabelecimentoSaudeType();
        if(cnes != null){
            CodigoCNESType cnesType = new CodigoCNESType();
            cnesType.setCodigo(cnes);
            filtro.setCodigoCNES(cnesType);
        }
        else if(numeroCnpj != null){
            CNPJType cnpjType = new CNPJType();
            cnpjType.setNumeroCNPJ(numeroCnpj);
            filtro.setCNPJ(cnpjType);
        }
        else {
            throw new IllegalArgumentException("Os dados do request não pode ser nulo");
        }
        dados.setFiltroPesquisaEstabelecimentoSaude(filtro);
        return dados;
    }



}
