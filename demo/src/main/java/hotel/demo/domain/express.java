package hotel.demo.domain;

public class express {
    private Integer id;
    private Integer numero;
    private String descripcion;
    private Integer num_cama;
    private Integer num_toallas;
    private Integer num_controles;
    private Integer codigo_condones;
    private Boolean tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo_condones() {
        return codigo_condones;
    }

    public void setCodigo_condones(Integer codigo_condones) {
        this.codigo_condones = codigo_condones;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNum_cama() {
        return num_cama;
    }

    public void setNum_cama(Integer num_cama) {
        this.num_cama = num_cama;
    }

    public Integer getNum_toallas() {
        return num_toallas;
    }

    public void setNum_toallas(Integer num_toallas) {
        this.num_toallas = num_toallas;
    }

    public Integer getNum_controles() {
        return num_controles;
    }

    public void setNum_controles(Integer num_controles) {
        this.num_controles = num_controles;
    }

   
}
