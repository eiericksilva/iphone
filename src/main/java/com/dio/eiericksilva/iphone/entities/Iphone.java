package com.dio.eiericksilva.iphone.entities;

import com.dio.eiericksilva.iphone.interfaces.AparelhoTelefonico;
import com.dio.eiericksilva.iphone.interfaces.NavegadorInternet;
import com.dio.eiericksilva.iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private Integer imei;
    private String modelo;
    private String numeroSerie;
    private int bateria;

    public Iphone(Integer imei, String modelo, String numeroSerie, int bateria) {
        this.imei = imei;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.bateria = bateria;
    }

    public Integer getImei() {
        return imei;
    }

    public void setImei(Integer imei) {
        this.imei = imei;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((imei == null) ? 0 : imei.hashCode());
        result = prime * result + ((numeroSerie == null) ? 0 : numeroSerie.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Iphone other = (Iphone) obj;
        if (imei == null) {
            if (other.imei != null)
                return false;
        } else if (!imei.equals(other.imei))
            return false;
        if (numeroSerie == null) {
            if (other.numeroSerie != null)
                return false;
        } else if (!numeroSerie.equals(other.numeroSerie))
            return false;
        return true;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página está sendo exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

}
