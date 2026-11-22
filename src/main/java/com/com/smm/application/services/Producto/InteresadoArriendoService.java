package com.com.smm.application.services.Producto;

import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.CreateInteresadoArriendoUseCase;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.DeleteInteresadoArriendoUseCase;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.RetrieveInteresadoArriendoUseCase;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.UpdateInteresadoArriendoUseCase;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InteresadoArriendoService implements
        CreateInteresadoArriendoUseCase,
        RetrieveInteresadoArriendoUseCase,
        UpdateInteresadoArriendoUseCase,
        DeleteInteresadoArriendoUseCase {

    private final CreateInteresadoArriendoUseCase createInteresadoArriendoUseCase;
    private final RetrieveInteresadoArriendoUseCase retrieveInteresadoArriendoUseCase;
    private final UpdateInteresadoArriendoUseCase updateInteresadoArriendoUseCase;
    private final DeleteInteresadoArriendoUseCase deleteInteresadoArriendoUseCase;

    public InteresadoArriendoService(
            CreateInteresadoArriendoUseCase createInteresadoArriendoUseCase,
            RetrieveInteresadoArriendoUseCase retrieveInteresadoArriendoUseCase,
            UpdateInteresadoArriendoUseCase updateInteresadoArriendoUseCase,
            DeleteInteresadoArriendoUseCase deleteInteresadoArriendoUseCase) {
        this.createInteresadoArriendoUseCase = createInteresadoArriendoUseCase;
        this.retrieveInteresadoArriendoUseCase = retrieveInteresadoArriendoUseCase;
        this.updateInteresadoArriendoUseCase = updateInteresadoArriendoUseCase;
        this.deleteInteresadoArriendoUseCase = deleteInteresadoArriendoUseCase;
    }

    @Override
    public InteresadoArriendo createInteresadoArriendo(InteresadoArriendo interesadoArriendo) {
        return createInteresadoArriendoUseCase.createInteresadoArriendo(interesadoArriendo);
    }

    @Override
    public Optional<InteresadoArriendo> getInteresadoArriendoById(Long id) {
        return retrieveInteresadoArriendoUseCase.getInteresadoArriendoById(id);
    }

    @Override
    public List<InteresadoArriendo> getAllInteresadoArriendo() {
        return retrieveInteresadoArriendoUseCase.getAllInteresadoArriendo();
    }

    @Override
    public List<InteresadoArriendo> getInteresadoArriendoByUsuarioId(Long usuarioId) {
        return retrieveInteresadoArriendoUseCase.getInteresadoArriendoByUsuarioId(usuarioId);
    }

    /**
     * @param productoId
     * @return
     */
    @Override
    public List<?> getSolicitudesConDetalle(Long productoId) {
        return List.of();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<?> getSolicitudDetalleById(Long id) {
        return List.of();
    }


    @Override
    public Optional<InteresadoArriendo> updateEstadoInteresadoArriendo(Long id, EstadoSolicitud nuevoEstado) {
        return updateInteresadoArriendoUseCase.updateEstadoInteresadoArriendo(id, nuevoEstado);
    }

    @Override
    public boolean deleteInteresadoArriendo(Long id) {
        return deleteInteresadoArriendoUseCase.deleteInteresadoArriendo(id);
    }
}