package com.com.smm.domain.model.Producto;


public enum EstadoSolicitud {
    PENDIENTE,
    EN_ESTUDIO,
    APROBADO,
    RECHAZADO;

    public static EstadoSolicitud fromString(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El estado no puede estar vacío.");
        }
        try {
            return EstadoSolicitud.valueOf(valor.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Estado inválido: " + valor);
        }
    }
}