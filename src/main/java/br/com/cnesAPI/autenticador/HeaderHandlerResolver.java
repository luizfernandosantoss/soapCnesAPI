package br.com.cnesAPI.autenticador;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class HeaderHandlerResolver implements HandlerResolver {

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {

        List<Handler> handlerChain = new ArrayList<Handler>();

        HeaderHandlerCnes hh = new HeaderHandlerCnes();

        handlerChain.add(hh);

        return handlerChain;
    }
}
