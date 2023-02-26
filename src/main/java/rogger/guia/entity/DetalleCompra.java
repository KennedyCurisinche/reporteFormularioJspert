package rogger.guia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleCompra {
        private Integer idproducto;
        private String nompro;
        private Double precmnpro;
        private Integer canpro;
        private Double importepro;
}
