/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vleos
 */
public class ActaElectoral {
    private String titulo;
    private String fecha;
    private String hora;
    private String lugar;
    private String Mesa;
    private Miembro[] miembros;
    private ConteoVoto [] conteovoto;
    

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, String Mesa, Miembro[] miembros, ConteoVoto [] conteovoto) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.Mesa = Mesa;
        this.miembros = miembros;
        this.conteovoto = conteovoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMesa() {
        return Mesa;
    }

    public void setMesa(String Mesa) {
        this.Mesa = Mesa;
    }

    public Miembro[] getMiembros() {
        return miembros;
    }

    public void setMiembros(Miembro[] miembros) {
        this.miembros = miembros;
    }

    public ConteoVoto[] getConteovoto() {
        return conteovoto;
    }

    public void setConteovoto(ConteoVoto[] conteovoto) {
        this.conteovoto = conteovoto;
    }
    
    
    
}
