package br.com.cnesAPI.service.impl;

import br.com.cnesAPI.autenticador.HeaderHandlerResolver;
import br.com.cnesAPI.service.BuscaCnesService;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.*;
import org.springframework.stereotype.Service;

@Service
public class BuscaCnesServiceImpl implements BuscaCnesService {

    public ResponseConsultarEstabelecimentoSaude buscarEstabelecimento(String cnes) throws CnesFault {
        CnesServicePortType port = abriConexao();
        RequestConsultarEstabelecimentoSaude dados = montarRequest(cnes);
        ResponseConsultarEstabelecimentoSaude resposta = port.consultarEstabelecimentoSaude(dados);
        return resposta;
    }

    private RequestConsultarEstabelecimentoSaude montarRequest(String cnes) {
        RequestConsultarEstabelecimentoSaude dados = new RequestConsultarEstabelecimentoSaude();
        if(cnes != null){
            CodigoCNESType cnesType = new CodigoCNESType();
            cnesType.setCodigo(cnes);
            dados.setCodigoCNES(cnesType);
        }else {
            //codigo colocado somente caso alguem queira copiar e colocar e jogar na aplicação,
            //O projeto rest ja não aceita valores nulos, por causa do mapeamento da URL
            throw new IllegalArgumentException("Cnes não pode ser nulo");
        }
        return dados;
    }

    private CnesServicePortType abriConexao() {
        CnesService service = new CnesService();
        service.setHandlerResolver(new HeaderHandlerResolver());
        return service.getCnesServicePort();
    }
}
