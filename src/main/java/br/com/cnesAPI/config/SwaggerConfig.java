package br.com.cnesAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                                                      .apis(RequestHandlerSelectors.basePackage("br.com.cnesAPI.rest"))
                                                      .paths(PathSelectors.regex("/.*"))
                                                      .build().apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder().title("CNES API")
                .description("Projeto para efetuar um consulta utlizando o serviço SOAP do CNES")
                .build();
    }
}