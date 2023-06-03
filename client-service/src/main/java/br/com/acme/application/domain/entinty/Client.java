package br.com.acme.application.domain.entinty;

        import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Client {
    private Long id;
    private String nome;

    private Email email;
    private Document document;
    private Phone phone;
    private List<Card> card;
}

