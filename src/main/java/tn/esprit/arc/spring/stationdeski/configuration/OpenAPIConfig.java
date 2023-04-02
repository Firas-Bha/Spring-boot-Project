package tn.esprit.arc.spring.stationdeski.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());

    }
    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());

    }
    public Contact contactAPI() {
        Contact contact = new Contact().name("Equipe ASI II")
                .email("firas.benhadjalouane@esprit.tn");

        return contact;
}
    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()

                .group("Only Skieur Management API")
                .pathsToMatch("/skieur/**")
                .pathsToExclude("**")
                .build();

    }

    @Bean
    public GroupedOpenApi productPublicApi1() {
        return GroupedOpenApi.builder()

                .group("Only Moniteur Management API")
                .pathsToMatch("/moniteur/**")
                .pathsToExclude("**")
                .build();

    }

    @Bean
    public GroupedOpenApi productPublicApi2() {
        return GroupedOpenApi.builder()

                .group("Only Moniteur Cours API")
                .pathsToMatch("/cours/**")
                .pathsToExclude("**")
                .build();

    }



}
